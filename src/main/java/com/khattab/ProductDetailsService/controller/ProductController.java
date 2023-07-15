package com.khattab.ProductDetailsService.controller;

import com.khattab.ProductDetailsService.entity.Product;
import com.khattab.ProductDetailsService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ecommerce/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
    @GetMapping("/{productId}")
    public Product get(@PathVariable UUID productId) {
        return productService.getProduct(productId);
    }
    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
