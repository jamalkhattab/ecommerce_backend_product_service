package com.khattab.ProductDetailsService.repository;

import com.khattab.ProductDetailsService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {
    Product findByProductId(UUID productId);
}
