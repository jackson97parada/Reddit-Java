package com.categories.services;

import com.categories.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> findAll();
    CategoryDTO findById(Long id);
}
