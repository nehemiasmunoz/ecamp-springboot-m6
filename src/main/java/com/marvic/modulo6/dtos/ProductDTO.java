package com.marvic.modulo6.dtos;

public record ProductDTO(
        long id,
        String name,
        String description,
        double price,
        long stock
) {
}
