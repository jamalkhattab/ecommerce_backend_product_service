package com.khattab.ProductDetailsService.service;

import com.khattab.ProductDetailsService.entity.Product;
import com.khattab.ProductDetailsService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        product.setProductId(UUID.randomUUID());
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(UUID productId) {
        return productRepository.findByProductId(productId);
    }
}
