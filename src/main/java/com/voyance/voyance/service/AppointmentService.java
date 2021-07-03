package com.voyance.voyance.service;

import com.voyance.voyance.models.Appointment;
import com.voyance.voyance.service.dtos.AppointmentRequestDTO;
import com.voyance.voyance.service.dtos.AppointmentResponseDTO;
import com.voyance.voyance.service.exceptions.RegisterException;

public interface AppointmentService{
    public AppointmentResponseDTO bookAppointment(AppointmentRequestDTO appointmentRequestDTO) throws RegisterException;
    public String deleteAppointment(Long appointmentId);

}
