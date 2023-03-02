package com.comments.services;

import com.comments.dtos.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> findAll();
    CommentDTO findById(Long id);
}
