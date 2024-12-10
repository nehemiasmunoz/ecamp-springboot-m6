package com.marvic.modulo6.restcontrollers;

import com.marvic.modulo6.dtos.ProductDTO;
import com.marvic.modulo6.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/products")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<ProductDTO> getProducts() {
        return productService.getAllProducts();
    }


}
