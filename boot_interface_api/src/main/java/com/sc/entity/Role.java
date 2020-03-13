package com.sc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {

    //角色ID
    private Integer roleId;
    //角色名称
    private String roleName;
}
