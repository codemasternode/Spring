package com.booking.service.service;

import com.booking.service.model.Booking;
import com.booking.service.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> findAllBooking(){
        return bookingRepository.findAll();
    }
    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }

}
