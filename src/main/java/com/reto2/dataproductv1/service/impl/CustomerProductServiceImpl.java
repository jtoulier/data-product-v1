package com.reto2.dataproductv1.service.impl;

import com.reto2.dataproductv1.dto.mapper.response.CustomerProductMapperResponse;
import com.reto2.dataproductv1.dto.response.CustomerProductResponse;
import com.reto2.dataproductv1.repository.CustomerProductRepository;
import com.reto2.dataproductv1.repository.entity.CustomerProductEntity;
import com.reto2.dataproductv1.repository.entity.key.CustomerProductEntityKey;
import com.reto2.dataproductv1.service.CustomerProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerProductServiceImpl implements CustomerProductService {
    @Autowired
    private CustomerProductRepository customerProductRepository;


    @Override
    public List<CustomerProductResponse> findByCic(String cic) {
        List<CustomerProductEntity> customerProductEntityList = customerProductRepository.findByCustomerProductEntityKeyCic(cic);

        CustomerProductMapperResponse customerProductMapperResponse = new CustomerProductMapperResponse();

        return customerProductMapperResponse.convertEntityListToResponseList(customerProductEntityList);
    }

    @Override
    public CustomerProductResponse findByCicTioAux(String cic, String tioAux) {
        CustomerProductResponse customerProductResponse = null;

        CustomerProductEntityKey customerProductEntityKey = new CustomerProductEntityKey();
        customerProductEntityKey.setCic(cic);
        customerProductEntityKey.setTioAux(tioAux);

        Optional<CustomerProductEntity> customerProductEntityOptional = customerProductRepository.findById(customerProductEntityKey);

        if (customerProductEntityOptional.isPresent()) {
            CustomerProductMapperResponse customerProductMapperResponse = new CustomerProductMapperResponse();
            customerProductResponse = customerProductMapperResponse.convertEntityToResponse(customerProductEntityOptional.get());
        }

        return customerProductResponse;
    }
}
