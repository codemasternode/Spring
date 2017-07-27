package com.booking.service;

import com.booking.service.model.Booking;
import com.booking.service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot implements CommandLineRunner{

    @Autowired
    private BookingService bookingService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }

    public void run(String... strings) throws Exception {
        Booking booking1 = new Booking("Kraków","12.03.2018","Marcin Warzybok","marcinwarzybok@outlook.com","543213543");
        Booking booking2 = new Booking("Kraków","12.03.2018","Marcin Warzybok","marcinwarzybok@outlook.com","543213543");
        Booking booking3 = new Booking("Kraków","12.03.2018","Marcin Warzybok","marcinwarzybok@outlook.com","543213543");
        bookingService.saveBooking(booking1);
        bookingService.saveBooking(booking3);
        bookingService.saveBooking(booking2);
    }
}
