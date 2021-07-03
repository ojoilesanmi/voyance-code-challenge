package com.voyance.voyance.repositories;

import com.voyance.voyance.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long>{
        Doctor findByEmail(String email);
        void deleteByEmail(String email);
}
