package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.PassportRequest;
import com.example.rentauto.dto.response.PassportResponse;
import com.example.rentauto.service.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PassportServiceImpl implements PassportService {
    @Override
    public void save(PassportRequest passportRequest) {

    }

    @Override
    public PassportResponse update(PassportRequest passportRequest) {
        return null;
    }

    @Override
    public PassportResponse findById(Long id) {
        return null;
    }

    @Override
    public List<PassportResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
