package com.sguptgup.InventoryMgtSystem.repositories;

import com.sguptgup.InventoryMgtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
