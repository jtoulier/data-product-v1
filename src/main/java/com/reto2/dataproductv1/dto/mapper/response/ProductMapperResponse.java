package com.reto2.dataproductv1.dto.mapper.response;

import com.reto2.dataproductv1.dto.response.ProductResponse;
import com.reto2.dataproductv1.repository.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductMapperResponse {

    public ProductResponse convertEntityToResponse(ProductEntity productEntity) {
        ProductResponse productResponse = null;

        if (productEntity != null) {
            productResponse = new ProductResponse();

            productResponse.setTioAux(productEntity.getProductEntityKey().getTioAux());
            productResponse.setDescription(productEntity.getDescription());
        }

        return productResponse;
    }

    public List<ProductResponse> convertEntityListToResponseList(List<ProductEntity> productEntityList) {
        List<ProductResponse> productResponseList = new ArrayList<>();

        if (productEntityList != null) {
            for (ProductEntity productEntity : productEntityList) {
                ProductResponse productResponse = convertEntityToResponse(productEntity);

                productResponseList.add(productResponse);
            }
        }

        return productResponseList;
    }

}