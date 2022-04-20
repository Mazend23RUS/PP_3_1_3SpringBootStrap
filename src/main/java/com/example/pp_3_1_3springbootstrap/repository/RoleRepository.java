package com.example.pp_3_1_3springbootstrap.repository;

import com.example.pp_3_1_3springbootstrap.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Set<Role> findAll();
    Role findRoleByRole(String role);
    Role findRoleById(Long id);
}
