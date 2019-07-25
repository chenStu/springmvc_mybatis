package cjs.ssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cjs
 * @description 日期转换器
 * @date 2019/7/24 13:58
 */
public class DateConverter implements Converter<String, Date> {
    /**
     * @author cjs
     * @description convert 实现将日期串转成日期类型（yyyy-MM-dd HH:mm:ss）
     * @date 2019/7/24 14:01
     * @param source
     * @return {@link Date}
     */
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(source);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
