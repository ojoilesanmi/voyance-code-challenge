package com.voyance.voyance.controllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.voyance.voyance.controllers.AppController;
import com.voyance.voyance.service.dtos.AddUserDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
//@ExtendWith(MockitoExtension.class)
//@WebMvcTest
public class AppControllerTest {

//    @Autowired
    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new AppController()).build();

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addUserApiTest () throws Exception {
        AddUserDto addUserDto = new AddUserDto();
        addUserDto.setEmail("samrtsammie@gmail.com");
        addUserDto.setFirstName("Ojo");
        addUserDto.setLastName("Ilesanmi");
        addUserDto.setGender("male");
        addUserDto.setPassword("insecurepassword");
        addUserDto.setRole("patient");

        ObjectMapper mapper = new ObjectMapper();

        mockMvc.perform(post("/api/v1/addUser")
                .contentType("application/json")
                .content(mapper.writeValueAsString(addUserDto)))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andReturn();

    }

}


