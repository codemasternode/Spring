package com.booking.service.service;

import com.booking.service.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricingService {
    @Autowired
    private PricingRepository pricingRepository;
}
