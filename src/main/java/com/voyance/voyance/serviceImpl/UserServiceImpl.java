package com.voyance.voyance.serviceImpl;

import com.voyance.voyance.models.*;
import com.voyance.voyance.repositories.UserRepo;
import com.voyance.voyance.service.UserService;
import com.voyance.voyance.service.dtos.AddResponseDto;
import com.voyance.voyance.service.dtos.AddUserDto;
import com.voyance.voyance.service.exceptions.RegisterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    UserService userService;


    @Override
    public AddResponseDto saveUser(AddUserDto addUserDto) throws RegisterException {
        if(addUserDto== null) throw new RegisterException("");
        User user = new User();
        user.setEmail(addUserDto.getEmail());
        user.setFirstName(addUserDto.getFirstName());
        user.setLastName(addUserDto.getLastName());
        user.setGender(Gender.valueOf(addUserDto.getGender().toUpperCase()));
        user.setPassword(addUserDto.getPassword());
        userRepo.save(user);
        return new AddResponseDto(addUserDto.getFirstName(), addUserDto.getLastName(), addUserDto.getEmail());
    }

    @Override
    public void deleteUser(String email) {
        userRepo.deleteByEmail(email);
    }




}
