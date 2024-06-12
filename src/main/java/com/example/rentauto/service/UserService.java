package com.example.rentauto.service;

import com.example.rentauto.dto.request.UserRequest;
import com.example.rentauto.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    void save(UserRequest userRequest);

    UserResponse update(UserRequest userRequest);

    UserResponse findById(Long id);

    List<UserResponse> findAll();

    void deleteById(Long id);
}
