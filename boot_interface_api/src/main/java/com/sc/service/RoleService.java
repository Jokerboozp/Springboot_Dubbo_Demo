package com.sc.service;

import com.sc.entity.Role;

public interface RoleService {

    //根据ID查看角色信息
    Role getRoleById(Integer roleId);
}
