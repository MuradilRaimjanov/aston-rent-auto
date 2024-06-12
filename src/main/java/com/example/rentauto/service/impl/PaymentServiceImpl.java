package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.PaymentRequest;
import com.example.rentauto.dto.response.PaymentResponse;
import com.example.rentauto.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void save(PaymentRequest paymentRequest) {

    }

    @Override
    public PaymentResponse update(PaymentRequest paymentRequest) {
        return null;
    }

    @Override
    public PaymentResponse findById(Long id) {
        return null;
    }

    @Override
    public List<PaymentResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
