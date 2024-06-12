package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.UserRequest;
import com.example.rentauto.dto.response.UserResponse;
import com.example.rentauto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public void save(UserRequest userRequest) {

    }

    @Override
    public UserResponse update(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse findById(Long id) {
        return null;
    }

    @Override
    public List<UserResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
