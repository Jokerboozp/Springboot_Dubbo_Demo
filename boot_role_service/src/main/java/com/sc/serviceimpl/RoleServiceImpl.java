package com.sc.serviceimpl;

import com.sc.entity.Role;
import com.sc.mapper.RoleMapper;
import com.sc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleById(Integer roleId) {
        Role roleById = roleMapper.getRoleById(roleId);
        return roleById;
    }
}
