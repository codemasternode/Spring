package com.booking.service.controler;


import com.booking.service.model.Booking;
import com.booking.service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RestController1 {
    @Autowired
    private BookingService bookingService;

    @RequestMapping(value = "/booking",method = RequestMethod.GET)
    public List<Booking> findAllBooking(){
        return bookingService.findAllBooking();
    }
}
