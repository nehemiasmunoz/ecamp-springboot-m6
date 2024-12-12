package com.marvic.modulo6.controllers;

import com.marvic.modulo6.dtos.product.NewProductDTO;
import com.marvic.modulo6.models.Product;
import com.marvic.modulo6.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    //Inyeccion por controllador
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String getAllProducts(Model model) {
        //Agregamos la lista a nuestro model
        model.addAttribute("products", productService.getAllProducts());
        //Retornamos nuestra vista (products.html) en conjunto con el model y sus atributos
        return "products";
    }

    @GetMapping("/form")
    public String getProductForm(Model model) {
        model.addAttribute("productDTO", NewProductDTO.class);
        return "product-form";
    }

    @PostMapping("/form")
    public String productForm(@ModelAttribute() NewProductDTO product) {
        productService.saveProduct(new Product().fromDTO(product));
        //Redireccion a ruta pre establecida luego de guardar
        return "redirect:/products/";
    }

}
