package com.favorites.repositories;

import com.favorites.models.Favorit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorit, Long> {
}
