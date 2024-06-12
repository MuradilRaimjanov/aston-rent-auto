package com.example.rentauto.service.impl;

import com.example.rentauto.dto.request.FavoriteRequest;
import com.example.rentauto.dto.response.FavoriteResponse;
import com.example.rentauto.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FavoriteServiceImpl implements FavoriteService {
    @Override
    public void save(FavoriteRequest favoriteRequest) {

    }

    @Override
    public FavoriteResponse update(FavoriteRequest favoriteRequest) {
        return null;
    }

    @Override
    public FavoriteResponse findById(Long id) {
        return null;
    }

    @Override
    public List<FavoriteResponse> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
