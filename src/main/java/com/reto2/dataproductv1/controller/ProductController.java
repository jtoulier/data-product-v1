package com.reto2.dataproductv1.controller;

import com.reto2.dataproductv1.repository.ProductRepository;
import com.reto2.dataproductv1.repository.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data-product-v1")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }
}
