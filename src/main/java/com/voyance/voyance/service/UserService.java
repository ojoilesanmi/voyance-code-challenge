package com.voyance.voyance.service;

import com.voyance.voyance.models.User;
import com.voyance.voyance.service.dtos.AddResponseDto;
import com.voyance.voyance.service.dtos.AddUserDto;
import com.voyance.voyance.service.exceptions.RegisterException;

public interface UserService {
    AddResponseDto saveUser(AddUserDto addUserDto) throws RegisterException;
    void deleteUser(String email);
}
