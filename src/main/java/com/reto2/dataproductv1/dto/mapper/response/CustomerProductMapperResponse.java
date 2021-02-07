package com.reto2.dataproductv1.dto.mapper.response;


import com.reto2.dataproductv1.dto.response.CustomerProductResponse;
import com.reto2.dataproductv1.repository.entity.CustomerProductEntity;

import java.util.ArrayList;
import java.util.List;

public class CustomerProductMapperResponse {
    public CustomerProductResponse convertEntityToResponse(CustomerProductEntity customerProductEntity) {
        CustomerProductResponse customerProductResponse = null;

        if (customerProductEntity != null) {
            customerProductResponse = new CustomerProductResponse();

            customerProductResponse.setCic(customerProductEntity.getCustomerProductEntityKey().getCic());;
            customerProductResponse.setTioAux(customerProductEntity.getCustomerProductEntityKey().getTioAux());;
            customerProductResponse.setDetails(customerProductEntity.getDetails());
        }

        return customerProductResponse;
    }

    public List<CustomerProductResponse> convertEntityListToResponseList(List<CustomerProductEntity> customerProductEntityList) {
        List<CustomerProductResponse> customerProductResponseList = new ArrayList<>();

        if (customerProductEntityList != null) {
            for (CustomerProductEntity customerProductEntity : customerProductEntityList) {
                CustomerProductResponse customerProductResponse = convertEntityToResponse(customerProductEntity);
                customerProductResponseList.add(customerProductResponse);
            }
        }

        return customerProductResponseList;
    }

}