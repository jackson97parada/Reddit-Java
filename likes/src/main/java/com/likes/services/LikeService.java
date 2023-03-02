package com.likes.services;

import com.likes.dtos.LikeDTO;

import java.util.List;

public interface LikeService {
    List<LikeDTO> findAll();
    LikeDTO findById(Long id);
}
