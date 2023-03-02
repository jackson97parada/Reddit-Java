package com.posts.services;

import com.posts.dtos.FilePostDTO;

import java.io.File;
import java.util.List;

public interface FilePostService {
    List<FilePostDTO> findAll();
    FilePostDTO findById(Long id);
}
