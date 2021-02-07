package com.reto2.dataproductv1.service;

import com.reto2.dataproductv1.dto.response.CustomerProductResponse;

import java.util.List;

public interface CustomerProductService {
    List<CustomerProductResponse> findByCic(String cic);
    CustomerProductResponse findByCicTioAux(String cic, String tioAux);
}
