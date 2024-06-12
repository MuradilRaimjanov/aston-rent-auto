package com.example.rentauto.service;

import com.example.rentauto.dto.request.TransportRequest;
import com.example.rentauto.dto.response.TransportResponse;

import java.util.List;

public interface TransportService {

    void save(TransportRequest transportRequest);

    TransportResponse update(TransportRequest transportRequest);

    TransportResponse findById(Long id);

    List<TransportResponse> findAll();

    void deleteById(Long id);
}
