package com.voyance.voyance.models;

import lombok.Data;

import com.voyance.voyance.models.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@Table
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    private Date date;

    @ManyToOne
    @JoinColumn(name =  "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;

    @Column(name = "appointment_time")
    private Calendar appointmentTime;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


}
