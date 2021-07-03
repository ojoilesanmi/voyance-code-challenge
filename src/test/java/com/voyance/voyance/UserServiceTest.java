package com.voyance.voyance;

import com.voyance.voyance.repositories.UserRepo;
import com.voyance.voyance.service.UserService;
import com.voyance.voyance.service.dtos.AddResponseDto;
import com.voyance.voyance.service.dtos.AddUserDto;
import com.voyance.voyance.service.exceptions.RegisterException;
import com.voyance.voyance.serviceImpl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.BDDMockito.given;

public class UserServiceTest {

    @Mock
    private UserRepo userRepo;


    private UserService userService;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
//        userService = new UserServiceImpl(userRepo);
    }

    @Test
    public void bookAppointmentTest() throws RegisterException {
        var addUserDto = new AddUserDto("odamilola36@gmail.com", "damilola", "omowumi", "patient", "male", "1234");
        var userResponse = new AddResponseDto("damilola", "omowumi","odamilola36@gmail.com");

        given(userService.saveUser(addUserDto)).willReturn(userResponse);


    }
}
