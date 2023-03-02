package com.categories.services;

import com.categories.dtos.SubCategoryDTO;

import java.util.List;

public interface SubCategoryService {
    List<SubCategoryDTO> findAll();
    SubCategoryDTO findById(Long id);
}
