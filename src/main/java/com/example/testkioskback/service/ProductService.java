package com.example.testkioskback.service;

import org.springframework.stereotype.Service;
import com.example.testkioskback.model.Product;
import com.example.testkioskback.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
