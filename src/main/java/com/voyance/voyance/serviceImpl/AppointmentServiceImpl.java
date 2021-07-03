package com.voyance.voyance.serviceImpl;

import com.voyance.voyance.models.Appointment;
import com.voyance.voyance.models.AppointmentStatus;
import com.voyance.voyance.repositories.AppointmentRepo;
import com.voyance.voyance.service.AppointmentService;
import com.voyance.voyance.service.dtos.AppointmentRequestDTO;
import com.voyance.voyance.service.dtos.AppointmentResponseDTO;
import com.voyance.voyance.service.exceptions.RegisterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;


@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepo appointmentRepo;
    @Override
    public AppointmentResponseDTO bookAppointment(AppointmentRequestDTO appointmentRequestDTO) throws RegisterException {
        if(appointmentRequestDTO == null) throw new RegisterException("Fill in the fields correctly");

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());

        calendar.add(Calendar.DATE, 5);
        Appointment appointment = new Appointment();

        appointment.setAppointmentStatus(AppointmentStatus.AVAILABLE);
        appointment.setAppointmentTime(calendar);

        var savedAppointment = appointmentRepo.save(appointment);
        return new AppointmentResponseDTO(savedAppointment.getId(), savedAppointment.getAppointmentStatus().toString(),
                calendar);
    }

    @Override
    public String deleteAppointment(Long appointmentId) {
        appointmentRepo.deleteById(appointmentId);
        return "You have successfully deleted this appointment";

    }
}

