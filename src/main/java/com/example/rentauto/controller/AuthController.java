package com.example.rentauto.controller;

import com.example.rentauto.dto.request.LoginRequest;
import com.example.rentauto.dto.request.RegisterRequest;
import com.example.rentauto.dto.response.LoginResponse;
import com.example.rentauto.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/sing-up")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity<>("Successfully registered", HttpStatus.OK);
    }

    @PostMapping("/sing-in")
    public ResponseEntity<LoginResponse> authentication(LoginRequest loginRequest) {
        return new ResponseEntity<>(authService.authentication(loginRequest), HttpStatus.OK);
    }

    @PatchMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestParam String email) {
        return null;
    }

}
