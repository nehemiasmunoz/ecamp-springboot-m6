package com.marvic.modulo6.models;

import com.marvic.modulo6.dtos.ProductDTO;
import com.marvic.modulo6.dtos.product.NewProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private long stock;

    public ProductDTO toDTO() {
        return new ProductDTO(this.id, this.name, this.description, this.price, this.stock);
    }

    public Product fromDTO(ProductDTO dto) {
        this.id = dto.id();
        this.name = dto.name();
        this.description = dto.description();
        this.price = dto.price();
        this.stock = dto.stock();
        return this;
    }

    public Product fromDTO(NewProductDTO dto) {
        this.name = dto.name();
        this.description = dto.description();
        this.price = dto.price();
        this.stock = dto.stock();
        return this;
    }
}
