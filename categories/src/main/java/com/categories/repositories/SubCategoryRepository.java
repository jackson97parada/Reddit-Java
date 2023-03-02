package com.categories.repositories;

import com.categories.models.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
