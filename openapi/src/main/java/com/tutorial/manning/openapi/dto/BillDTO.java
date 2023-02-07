package com.tutorial.manning.openapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BillDTO {
    private Float price;
    private String current;
    private Integer amount;

    public BillDTO(){
    }
}
