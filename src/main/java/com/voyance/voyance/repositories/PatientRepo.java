package com.voyance.voyance.repositories;

import com.voyance.voyance.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
    Patient findByEmail(String email);
    void deleteByEmail(String email);
}
