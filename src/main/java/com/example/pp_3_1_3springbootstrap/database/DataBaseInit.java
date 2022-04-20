package com.example.pp_3_1_3springbootstrap.database;

import com.example.pp_3_1_3springbootstrap.model.User;
import com.example.pp_3_1_3springbootstrap.model.Role;
import com.example.pp_3_1_3springbootstrap.service.RoleService;
import com.example.pp_3_1_3springbootstrap.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataBaseInit {

    private final UserService userService;
    private final RoleService roleService;

    public DataBaseInit(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void addUsersInDB() {
        User admin = new User("ADMIN", "ADMINOV", 38, "1");
        User user = new User("USER", "USEROV", 35, "1");
        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");
        roleService.addRole(adminRole);
        roleService.addRole(userRole);
        admin.setOneRole(adminRole);
        user.setOneRole(userRole);
        userService.addUser(admin);
        userService.addUser(user);
    }
}
