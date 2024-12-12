package com.marvic.modulo6.dtos.product;

public record NewProductDTO(
        String name,
        String description,
        double price,
        long stock
) {
}
