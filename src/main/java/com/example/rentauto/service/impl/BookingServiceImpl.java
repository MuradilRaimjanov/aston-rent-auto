package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.BookingRequest;
import com.example.rentauto.dto.response.BookingResponse;
import com.example.rentauto.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    @Override
    public void save(BookingRequest bookingRequest) {

    }

    @Override
    public BookingResponse update(BookingRequest bookingRequest) {
        return null;
    }

    @Override
    public BookingResponse findById(Long id) {
        return null;
    }

    @Override
    public List<BookingResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
