package com.reto2.dataproductv1.controller;

import com.reto2.dataproductv1.repository.entity.CustomerProductEntity;
import com.reto2.dataproductv1.repository.CustomerProductRepository;
import com.reto2.dataproductv1.repository.entity.key.CustomerProductEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/data-product-v1")
public class CustomerProductController {
    @Autowired
    private CustomerProductRepository customerProductRepository;

    @GetMapping("/customer/{cic}/product")
    public List<CustomerProductEntity> findByCic(
        @PathVariable("cic") String cic
    ) {
        return customerProductRepository.findByCustomerProductEntityKeyCic(cic);
    }

    @GetMapping("/customer/{cic}/product/{tio-aux}")
    public Optional<CustomerProductEntity> findByCicTioAux(
        @PathVariable("cic") String cic,
        @PathVariable("tio-aux") String tioAux
    ) {
        CustomerProductEntityKey customerProductEntityKey = new CustomerProductEntityKey();
        customerProductEntityKey.setCic(cic);
        customerProductEntityKey.setTioAux(tioAux);

        return customerProductRepository.findById(customerProductEntityKey);
    }
}
