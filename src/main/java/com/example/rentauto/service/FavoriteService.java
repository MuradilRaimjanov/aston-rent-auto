package com.example.rentauto.service;

import com.example.rentauto.dto.request.FavoriteRequest;
import com.example.rentauto.dto.response.FavoriteResponse;

import java.util.List;

public interface FavoriteService {

    void save(FavoriteRequest favoriteRequest);

    FavoriteResponse update(FavoriteRequest favoriteRequest);

    FavoriteResponse findById(Long id);

    List<FavoriteResponse> findAll();

    void deleteById(Long id);
}
