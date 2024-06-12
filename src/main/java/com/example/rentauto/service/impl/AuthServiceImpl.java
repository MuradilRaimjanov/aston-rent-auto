package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.LoginRequest;
import com.example.rentauto.dto.request.RegisterRequest;
import com.example.rentauto.dto.response.LoginResponse;
import com.example.rentauto.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public void register(RegisterRequest registerRequest) {

    }

    @Override
    public LoginResponse authentication(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public void forgotPassword(String email) {

    }

    @Override
    public void resetPassword(String password, Principal principal) {

    }
}
