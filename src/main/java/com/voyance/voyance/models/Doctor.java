package com.voyance.voyance.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Doctor extends User{

    @NotBlank
    @NotNull
    private String licenseNumber;

    @NotBlank
    @NotNull
    private String specialty;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
