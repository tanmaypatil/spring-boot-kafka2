package com.streaming.payments;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppointmentController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Autowired
	private KafkaSenderExample kafkaSenderExample;
	
	@Autowired
	private KafkaSenderWithMessageConverter messageConverterSender;
	
	@Value("${com.streaming.payments.topic-1}")
	private String topic1;

	@Value("${com.streaming.payments.topic-2}")
	private String topic2;
	
	
	
    @GetMapping("/appointments")
    Appointment getAppointment() {
        String message = "appointment message";
        System.out.println("request for appointment on "+topic1);
        LOG.info("---------------------------------");
		kafkaSenderExample.sendMessage(message, topic1);
        return new Appointment(message, new Date());


    }
    
}
