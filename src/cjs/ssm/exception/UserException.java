package cjs.ssm.exception;

/**
 * @author cjs
 * @description 系统自定义异常类
 * @date 2019/7/25 14:01
 */
public class UserException extends Exception{
    //异常信息
    private String message;

    public UserException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
