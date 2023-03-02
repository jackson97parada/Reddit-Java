package com.likes.repositories;

import com.likes.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
