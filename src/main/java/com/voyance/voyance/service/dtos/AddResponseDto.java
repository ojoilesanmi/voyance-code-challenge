package com.voyance.voyance.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddResponseDto {

    private String firstName;
    private String lastName;
    private String email;

}
