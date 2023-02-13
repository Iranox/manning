package com.tutorial.manning.openapi.controller;

import com.tutorial.manning.openapi.data.Transaction;
import com.tutorial.manning.openapi.dto.TransactionDTO;
import com.tutorial.manning.openapi.service.TransactionService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@WebMvcTest(TransactionController.class)
public class TransactionControllerIntegrationsTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService service;
    @Autowired
    private TransactionController transactionController;
@Test
    public void testAllTransactions(){
        final Transaction transaction =  Transaction.builder()
                .date(new Date())
                .price(250F)
                .accountNumber(1234)
                .amount(54)
                .accountNumber(4)
                .current("Euro")
                .merchantLogo("Bild")
                .merchantName("TestCompany")
                .type("Test")
                .build();
        when(service.findAllTransactions(4)).thenReturn(List.of(transaction));
        final List<TransactionDTO> allTransactions =  transactionController.findAllTransaction(4);
        assertThat(allTransactions.size()).isEqualTo(1);
        assertThat((allTransactions.get(0).getBill().getAmount())).isEqualTo(54);
    }
}
