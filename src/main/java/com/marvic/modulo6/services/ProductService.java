package com.marvic.modulo6.services;

import com.marvic.modulo6.dtos.ProductDTO;
import com.marvic.modulo6.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    ArrayList<Product> products = new ArrayList<>();

    ProductService() {
        products.add(new Product(1, "Laptop", "Laptop gaming de alto rendimiento", 1500.0, 12));
        products.add(new Product(2, "Smartphone", "Último modelo con tecnología 5G", 800.0, 1));
        products.add(new Product(3, "Teclado", "Teclado mecánico retroiluminado", 100.0, 0));

    }


    public List<ProductDTO> getAllProducts() {
        //Convertimos nuestros productos a productos dto
        return products.stream()
                .map(Product::toDTO)
                .collect(Collectors.toList());
    }

    public void saveProduct(Product product) {
        products.add(product);
    }
}

