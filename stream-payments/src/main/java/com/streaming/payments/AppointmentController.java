package com.streaming.payments;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    @GetMapping("/appointments")
    Appointment getAppointment() {
        System.out.println("request for appointment");
        return new Appointment("tanmay", new Date());
    }
    
}
