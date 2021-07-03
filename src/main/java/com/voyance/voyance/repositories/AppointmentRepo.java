package com.voyance.voyance.repositories;

import com.voyance.voyance.models.Appointment;
import com.voyance.voyance.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
