package com.sguptgup.InventoryMgtSystem.services;

import com.sguptgup.InventoryMgtSystem.dtos.Response;
import com.sguptgup.InventoryMgtSystem.dtos.TransactionRequest;
import com.sguptgup.InventoryMgtSystem.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
