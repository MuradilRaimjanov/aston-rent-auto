package com.example.rentauto.service;

import com.example.rentauto.dto.request.PaymentRequest;
import com.example.rentauto.dto.response.PaymentResponse;

import java.util.List;

public interface PaymentService {

    void save(PaymentRequest paymentRequest);

    PaymentResponse update(PaymentRequest paymentRequest);

    PaymentResponse findById(Long id);

    List<PaymentResponse> findAll();

    void deleteById(Long id);
}
