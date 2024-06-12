package com.example.rentauto.service;

import com.example.rentauto.dto.request.DrivingLicenseRequest;
import com.example.rentauto.dto.response.DrivingLicenseResponse;

import java.util.List;

public interface DrivingLicenseService {

    void save(DrivingLicenseRequest drivingLicenseRequest);

    DrivingLicenseResponse update(DrivingLicenseRequest drivingLicenseRequest);

    DrivingLicenseResponse findById(Long id);

    List<DrivingLicenseResponse> findAll();

    void deleteById(Long id);
}
