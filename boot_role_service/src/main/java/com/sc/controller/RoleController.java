package com.sc.controller;

import com.sc.entity.Role;
import com.sc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @RequestMapping("/role/{roleId}")
    public Role getRoleById(@PathVariable("roleId")Integer roleId){
        Role roleById = roleService.getRoleById(roleId);
        return roleById;
    }
}
