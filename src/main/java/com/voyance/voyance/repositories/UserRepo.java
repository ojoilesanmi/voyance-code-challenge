package com.voyance.voyance.repositories;

import com.voyance.voyance.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    void deleteByEmail(String email);
}
