package com.example.rentauto.service;

import com.example.rentauto.dto.request.PassportRequest;
import com.example.rentauto.dto.response.PassportResponse;

import java.util.List;

public interface PassportService {

    void save(PassportRequest passportRequest);

    PassportResponse update(PassportRequest passportRequest);

    PassportResponse findById(Long id);

    List<PassportResponse> findAll();

    void deleteById(Long id);
}
