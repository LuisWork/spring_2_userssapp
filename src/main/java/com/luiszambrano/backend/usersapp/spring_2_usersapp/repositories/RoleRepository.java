package com.luiszambrano.backend.usersapp.spring_2_usersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.luiszambrano.backend.usersapp.spring_2_usersapp.models.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
