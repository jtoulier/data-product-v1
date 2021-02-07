package com.reto2.dataproductv1.service.impl;

import com.reto2.dataproductv1.dto.mapper.response.ProductMapperResponse;
import com.reto2.dataproductv1.dto.response.ProductResponse;
import com.reto2.dataproductv1.repository.ProductRepository;
import com.reto2.dataproductv1.repository.entity.ProductEntity;
import com.reto2.dataproductv1.repository.entity.key.ProductEntityKey;
import com.reto2.dataproductv1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponse> findAll() {
        List<ProductEntity> productEntityList = productRepository.findAll();

        ProductMapperResponse productMapperResponse = new ProductMapperResponse();

        return productMapperResponse.convertEntityListToResponseList(productEntityList);
    }

    @Override
    public ProductResponse findByTioAux(String tioAux) {
        ProductResponse productResponse = null;

        ProductEntityKey productEntityKey = new ProductEntityKey();
        productEntityKey.setTioAux(tioAux);

        Optional<ProductEntity> productEntityOptional = productRepository.findById(productEntityKey);

        if (productEntityOptional.isPresent()) {
            ProductMapperResponse productMapperResponse = new ProductMapperResponse();
            productResponse = productMapperResponse.convertEntityToResponse(productEntityOptional.get());
        }

        return productResponse;
    }
}
