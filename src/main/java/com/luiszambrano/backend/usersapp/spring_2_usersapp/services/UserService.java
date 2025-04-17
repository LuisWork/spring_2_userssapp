package com.luiszambrano.backend.usersapp.spring_2_usersapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.luiszambrano.backend.usersapp.spring_2_usersapp.models.dto.UserDto;
import com.luiszambrano.backend.usersapp.spring_2_usersapp.models.entities.User;
import com.luiszambrano.backend.usersapp.spring_2_usersapp.models.request.UserRequest;

public interface UserService {

    List<UserDto> findAll();

    Page<UserDto> findAll(Pageable pagaeable);

    Optional<UserDto> findById(Long id);

    UserDto save(User user);

    Optional<UserDto> update(UserRequest user, Long id);

    void remove(Long id);

}
