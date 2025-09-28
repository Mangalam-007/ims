package com.sguptgup.InventoryMgtSystem.repositories;

import com.sguptgup.InventoryMgtSystem.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
