package com.codegym.service.imp;

import com.codegym.dto.UserDto;
import com.codegym.model.User;
import com.codegym.repository.IUserRepository;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAll(Pageable of) {
        return userRepository.findAll(of);
    }

    @Override
    public void createNewUser(UserDto userDto) {
        User user = new User(userDto.getId(),userDto.getFirstName(),userDto.getLastName(),userDto.getPhoneNumber(),userDto.getAge(),userDto.getEmail());
        userRepository.save(user);
    }
}
