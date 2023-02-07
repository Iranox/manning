package com.tutorial.manning.openapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Builder
@AllArgsConstructor
@Data
public class MerchantDTO {
    private String logo;
    private String name;
}
