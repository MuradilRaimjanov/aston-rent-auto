package com.example.rentauto.service;

import com.example.rentauto.dto.request.LoginRequest;
import com.example.rentauto.dto.request.RegisterRequest;
import com.example.rentauto.dto.response.LoginResponse;

import java.security.Principal;

public interface AuthService {

        void register(RegisterRequest registerRequest);

        LoginResponse authentication(LoginRequest loginRequest);

        void forgotPassword(String email);

        void resetPassword(String password, Principal principal);
}
