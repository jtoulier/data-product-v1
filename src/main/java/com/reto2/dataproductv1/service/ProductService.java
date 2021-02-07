package com.reto2.dataproductv1.service;

import com.reto2.dataproductv1.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> findAll();
    ProductResponse findByTioAux(String tioAux);
}
