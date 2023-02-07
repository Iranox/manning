package com.tutorial.manning.openapi.mapper;

import com.tutorial.manning.openapi.data.Transaction;
import com.tutorial.manning.openapi.dto.BillDTO;
import com.tutorial.manning.openapi.dto.MerchantDTO;
import com.tutorial.manning.openapi.dto.TransactionDTO;

public class TransactionsMapper {

    public static TransactionDTO map(final Transaction transaction){
        final BillDTO bill = BillDTO.builder()
                .amount(transaction.getAmount())
                .current(transaction.getCurrent())
                .price(transaction.getPrice())
                .build();
        final MerchantDTO merchantDTO = MerchantDTO.builder()
                .logo(transaction.getMerchantLogo())
                .name(transaction.getMerchantName())
                .build();
        return TransactionDTO.builder()
                .account(transaction.getAccountNumber())
                .trancationDate(transaction.getDate())
                .merchant(merchantDTO)
                .bill(bill)
                .build();
    }
}
