package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.TransportRequest;
import com.example.rentauto.dto.response.TransportResponse;
import com.example.rentauto.service.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TransportServiceImpl implements TransportService {
    @Override
    public void save(TransportRequest transportRequest) {

    }

    @Override
    public TransportResponse update(TransportRequest transportRequest) {
        return null;
    }

    @Override
    public TransportResponse findById(Long id) {
        return null;
    }

    @Override
    public List<TransportResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
