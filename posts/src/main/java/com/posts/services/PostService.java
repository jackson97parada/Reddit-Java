package com.posts.services;

import com.posts.dtos.PostDTO;
import com.posts.models.Post;

import java.util.List;

public interface PostService {
    List<PostDTO> findAll();
    PostDTO findById(Long id);
}
