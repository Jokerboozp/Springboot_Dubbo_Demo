package com.sc.mapper;

import com.sc.entity.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    //根据ID查看角色信息
    Role getRoleById(Integer roleId);
}
