package com.voyance.voyance.controllers;

import com.voyance.voyance.service.AppointmentService;
import com.voyance.voyance.service.UserService;
import com.voyance.voyance.service.dtos.AddResponseDto;
import com.voyance.voyance.service.dtos.AddUserDto;
import com.voyance.voyance.service.dtos.AppointmentRequestDTO;
import com.voyance.voyance.service.dtos.AppointmentResponseDTO;
import com.voyance.voyance.service.exceptions.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class AppController {

    @Autowired
    UserService userService;

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/addUser")
    public ResponseEntity<AddResponseDto> addUser(@RequestBody AddUserDto addUserDto) throws ApplicationException {
        var response = userService.saveUser(addUserDto);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam(value = "email") String email) {
        userService.deleteUser(email);
        return ResponseEntity.ok("Successfully Deleted");
    }
    @PostMapping("/bookAppointment")
    public ResponseEntity<AppointmentResponseDTO> addAppointment(@RequestBody AppointmentRequestDTO appointmentRequestDTO) throws ApplicationException{
        var response = appointmentService.bookAppointment(appointmentRequestDTO);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/deleteAppointment")
    public ResponseEntity<String> deleteAppointment(@RequestParam(value = "id") Long id){
        var response = appointmentService.deleteAppointment(id);
        return ResponseEntity.ok(response);
    }

}
