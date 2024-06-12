package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.RentTermsRequest;
import com.example.rentauto.dto.response.RentTermsResponse;
import com.example.rentauto.service.RentTermsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RentTermsServiceImpl implements RentTermsService {
    @Override
    public void save(RentTermsRequest rentTermsRequest) {

    }

    @Override
    public RentTermsResponse update(RentTermsRequest rentTermsRequest) {
        return null;
    }

    @Override
    public RentTermsResponse findById(Long id) {
        return null;
    }

    @Override
    public List<RentTermsResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
