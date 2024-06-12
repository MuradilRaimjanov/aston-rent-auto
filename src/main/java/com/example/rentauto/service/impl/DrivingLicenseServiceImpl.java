package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.DrivingLicenseRequest;
import com.example.rentauto.dto.response.DrivingLicenseResponse;
import com.example.rentauto.service.DrivingLicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DrivingLicenseServiceImpl implements DrivingLicenseService {
    @Override
    public void save(DrivingLicenseRequest drivingLicenseRequest) {

    }

    @Override
    public DrivingLicenseResponse update(DrivingLicenseRequest drivingLicenseRequest) {
        return null;
    }

    @Override
    public DrivingLicenseResponse findById(Long id) {
        return null;
    }

    @Override
    public List<DrivingLicenseResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
