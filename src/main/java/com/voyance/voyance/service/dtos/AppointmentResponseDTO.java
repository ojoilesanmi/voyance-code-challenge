package com.voyance.voyance.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Calendar;

@Data
@AllArgsConstructor
public class AppointmentResponseDTO {
    private Long id;
    private String appointmentStatus;
    private Calendar appointmentTime;

    public AppointmentResponseDTO() {

    }
}
