package com.luiszambrano.backend.usersapp.spring_2_usersapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.luiszambrano.backend.usersapp.spring_2_usersapp.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
