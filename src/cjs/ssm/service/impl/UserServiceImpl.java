package cjs.ssm.service.impl;

import cjs.ssm.mapper.UserMapper;
import cjs.ssm.po.User;
import cjs.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() throws Exception {
        return userMapper.findAllUser();
    }

    @Override
    public List<User> findUserByName(String name) throws Exception {
        return userMapper.findUserByName(name);
    }

    @Override
    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

    @Override
    public void insertUser(User user) throws Exception {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) throws Exception {
        userMapper.deleteUser(id);
    }

}
