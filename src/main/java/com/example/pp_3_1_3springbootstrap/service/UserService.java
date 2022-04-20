package com.example.pp_3_1_3springbootstrap.service;


import com.example.pp_3_1_3springbootstrap.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    void addUser(User u);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User u);
    com.example.pp_3_1_3springbootstrap.model.User getByName(String name);
}
