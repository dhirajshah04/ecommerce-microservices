package com.ecommerce.product_service.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class ProductRequestDto {

    private String name;
    private String description;
    private BigDecimal price;

}
