package com.example.pp_3_1_3springbootstrap.service;

import com.example.pp_3_1_3springbootstrap.model.Role;

import java.util.Set;

public interface RoleService {

    Set<Role> getAllRoles();
    Role getRoleByID(Long id);
    Role getRoleByName(String name);
    void addRole(Role role);
}
