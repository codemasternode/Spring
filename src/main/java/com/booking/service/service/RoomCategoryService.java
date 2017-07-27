package com.booking.service.service;

import com.booking.service.repository.RoomCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomCategoryService {
    @Autowired
    private RoomCategoryRepository roomCategoryRepository;
}
