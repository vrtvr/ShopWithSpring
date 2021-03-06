package com.sda.dto;

import lombok.Data;

@Data
public class CreateProductDto {
    //DTO - Data Transfer Object

    private Integer price;
    private Integer quantity;
    private String name;
    private String description;
    private String imageUrl;
}
