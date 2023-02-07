package com.tutorial.manning.openapi.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class TransactionDTO {
    private BillDTO bill;
    private MerchantDTO merchant;
    private Integer account;
    private Date trancationDate;
}
