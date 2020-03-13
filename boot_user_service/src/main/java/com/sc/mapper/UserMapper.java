package com.sc.mapper;

import com.sc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查找所有用户
    List<User> getAllUser();

    //根据Id查找用户
    User getUserById(Integer userId);

    //删除用户
    void deleteUser(Integer userId);

    //更新用户
    void updateUser(User user);

    //新增用户
    void addUser(User user);

    //根据角色ID查询用户列表
    List<User> getUserByRoleId(Integer roleId);

    //通过用户名查找用户
    User getUserByName(String userName);

    //查询除了管理员外的用户列表
    List<User> getUserWithOutAdmin();

    //模糊查询用户
    List<User> searchUser(String userRealName);

}
