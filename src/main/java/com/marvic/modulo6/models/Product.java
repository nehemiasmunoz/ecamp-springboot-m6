package com.marvic.modulo6.models;

import com.marvic.modulo6.dtos.ProductDTO;
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
    private boolean available;

    public ProductDTO toDTO() {
        return  new ProductDTO(this.id, this.name, this.description, this.price, this.available);
    }

}
