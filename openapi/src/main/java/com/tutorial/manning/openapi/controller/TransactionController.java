package com.tutorial.manning.openapi.controller;

import com.tutorial.manning.openapi.dto.TransactionDTO;
import com.tutorial.manning.openapi.mapper.TransactionsMapper;
import com.tutorial.manning.openapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/transaction/{id}")
    public List<TransactionDTO> findAllTransaction(@PathVariable Integer id){
        return transactionService.findAllTransactions(id).stream()
                .map(TransactionsMapper::map)
                .collect(Collectors.toList());
    }
}
