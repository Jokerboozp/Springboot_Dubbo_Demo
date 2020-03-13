package com.sc.entity;

import lombok.Data;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    //用户ID
    private Integer userId;
    //用户名
    private String userName;
    //用户姓名
    private String userRealName;
    //用户性别
    private String userSex;
    //用户电话
    private String userTel;
    //用户邮箱
    private String userEmail;
    //用户密码
    private String password;
    //角色ID
    private Integer roleId;
    //用户生日
    private Date userBirth;
    private Role role;
}
