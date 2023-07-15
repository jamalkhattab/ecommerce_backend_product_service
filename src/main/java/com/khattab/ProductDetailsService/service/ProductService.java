package com.khattab.ProductDetailsService.service;

import com.khattab.ProductDetailsService.entity.Product;
import com.khattab.ProductDetailsService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    public Product save(Product product);

    public List<Product> getAllProducts();

    public Product getProduct(UUID productId);
}
