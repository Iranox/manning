package com.tutorial.manning.openapi.repo;

import com.tutorial.manning.openapi.data.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountNumber(final Integer accountNumber);
}
