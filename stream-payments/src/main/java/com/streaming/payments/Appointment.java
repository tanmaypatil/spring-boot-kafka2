package com.streaming.payments;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Appointment {
    String name ;
    Date fromTime ;

    public  Appointment() {

    }

    public Appointment(String name , Date fromDate) {
        this.name = name ;
        this.fromTime = fromDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }
}
