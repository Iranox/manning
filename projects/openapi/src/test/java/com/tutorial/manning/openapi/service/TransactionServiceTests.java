package com.tutorial.manning.openapi.service;

import com.tutorial.manning.openapi.data.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TransactionServiceTests {
    @Autowired
    private TransactionService transactionService;

    @Test
    public void testAllTransactions(){
       final List<Transaction> allTransactions =  transactionService.findAllTransactions(4);
        assertThat(allTransactions).isNotNull();
        assertThat(allTransactions.size()).isEqualTo(3);
    }
}
