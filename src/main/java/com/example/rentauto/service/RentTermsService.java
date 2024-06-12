package com.example.rentauto.service;

import com.example.rentauto.dto.request.RentTermsRequest;
import com.example.rentauto.dto.response.RentTermsResponse;

import java.util.List;

public interface RentTermsService {

    void save(RentTermsRequest rentTermsRequest);

    RentTermsResponse update(RentTermsRequest rentTermsRequest);

    RentTermsResponse findById(Long id);

    List<RentTermsResponse> findAll();

    void deleteById(Long id);
}
