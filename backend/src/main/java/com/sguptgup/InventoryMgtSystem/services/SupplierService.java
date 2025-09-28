package com.sguptgup.InventoryMgtSystem.services;

import com.sguptgup.InventoryMgtSystem.dtos.Response;
import com.sguptgup.InventoryMgtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
