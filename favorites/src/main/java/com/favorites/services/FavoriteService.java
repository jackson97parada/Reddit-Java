package com.favorites.services;

import com.favorites.dtos.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> findAll();
    FavoriteDTO findById(Long id);
}
