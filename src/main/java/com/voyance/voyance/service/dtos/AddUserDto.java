package com.voyance.voyance.service.dtos;

import com.voyance.voyance.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUserDto {

    @Email(message= "This is not a valid email address")
    private String email;

    private String firstName;

    private String lastName;

    private String role;

    private String gender;

    private String password;
}
