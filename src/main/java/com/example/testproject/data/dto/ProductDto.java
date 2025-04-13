package com.example.testproject.data.dto;

import com.example.testproject.data.entity.ProductEntity;
import lombok.*;

@ToString
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
