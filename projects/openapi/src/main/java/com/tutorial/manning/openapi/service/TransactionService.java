package com.tutorial.manning.openapi.service;

import com.tutorial.manning.openapi.data.Transaction;
import com.tutorial.manning.openapi.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepo transactionRepo;
    public List<Transaction> findAllTransactions(final Integer id){
        final List<Transaction> transaction = transactionRepo.findByAccountNumber(id);
        return transaction;
    }
}
