package com.sc.serviceimpl;

import com.sc.entity.User;
import com.sc.mapper.UserMapper;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserById(Integer userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> getUserByRoleId(Integer roleId) {
        return userMapper.getUserByRoleId(roleId);
    }

    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public List<User> getUserWithOutAdmin() {
        return userMapper.getUserWithOutAdmin();
    }

    @Override
    public List<User> searchUser(String userRealName) {
        if (userRealName!=null && !userRealName.equals(" "))
            userRealName="%"+userRealName+"%";
        else
            userRealName=null;
        return userMapper.searchUser(userRealName);
    }
}
