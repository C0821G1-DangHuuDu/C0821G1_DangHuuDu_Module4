package com.codegym.service;

import com.codegym.dto.UserDto;
import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    Page<User> findAll(Pageable of);

    void createNewUser(UserDto userDto);
}
