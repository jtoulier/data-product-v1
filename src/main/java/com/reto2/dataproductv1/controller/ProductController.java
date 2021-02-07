package com.reto2.dataproductv1.controller;

import com.reto2.dataproductv1.dto.response.ProductResponse;
import com.reto2.dataproductv1.repository.ProductRepository;
import com.reto2.dataproductv1.repository.entity.ProductEntity;
import com.reto2.dataproductv1.repository.entity.key.ProductEntityKey;
import com.reto2.dataproductv1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/data-product-v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<ProductResponse>> findAll() {
        return new ResponseEntity(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/product/{tio-aux}")
    public ResponseEntity<ProductResponse> findByTioAux(
        @PathVariable("tio-aux") String tioAux
    ) {
        return new ResponseEntity(productService.findByTioAux(tioAux), HttpStatus.OK);
    }
}
