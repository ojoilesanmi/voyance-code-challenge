package com.voyance.voyance.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    @NotBlank
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotBlank
    @NotNull
    private String lastName;

    @Column(name = "email")
    @NotBlank
    private String email; //email serves as username

    @Enumerated(EnumType.STRING)
    private Gender gender;


    @NotBlank
    @NotNull
    private String password;

    @Column(name = "is_enabled")
    @JsonIgnore
    private int isEnabled;

    @Column(name = "appointment")
    @OneToMany
    private List<Appointment> appointments;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (((id ==null)) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }








}
