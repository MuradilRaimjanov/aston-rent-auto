package com.example.rentauto.service;

import com.example.rentauto.dto.request.BookingRequest;
import com.example.rentauto.dto.response.BookingResponse;

import java.util.List;

public interface BookingService {

    void save(BookingRequest bookingRequest);

    BookingResponse update(BookingRequest bookingRequest);

    BookingResponse findById(Long id);

    List<BookingResponse> findAll();

    void deleteById(Long id);
}
