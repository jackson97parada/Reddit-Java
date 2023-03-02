package com.posts.repositories;

import com.posts.models.FilePost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilePostRepository extends JpaRepository<FilePost, Long> {
}
