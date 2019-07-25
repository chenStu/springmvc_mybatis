package cjs.ssm.service;

import cjs.ssm.po.User;

import java.util.List;

public interface UserService {
    /**
     * @author cjs
     * @description findAllUser 查询所有用户
     * @date 2019/7/25 9:34
     * @param
     * @return {@link List< User>}
     */
    public List<User> findAllUser() throws Exception;

    /**
     * @author cjs
     * @description findUserByName 根据姓名查询用户
     * @date 2019/7/25 9:36
     * @param
     * @return {@link List< User>}
     */
    public List<User> findUserByName(String name) throws Exception;

    /**
     * @author cjs
     * @description findUserById 根据id查询用户
     * @date 2019/7/25 9:40
     * @param id
     * @return {@link User}
     */
    public User findUserById(Integer id) throws Exception;

    /**
     * @author cjs
     * @description insertUser 添加用户
     * @date 2019/7/25 9:38
     * @param user
     * @return
     */
    public void insertUser(User user) throws Exception;

    /**
     * @author cjs
     * @description updateUser 更新用户信息
     * @date 2019/7/25 9:40
     * @param user
     * @return
     */
    public void updateUser(User user) throws Exception;

    /**
     * @author cjs
     * @description deleteUser 删除用户
     * @date 2019/7/25 9:40
     * @param id
     * @return
     */
    public void deleteUser(Integer id) throws Exception;
}
