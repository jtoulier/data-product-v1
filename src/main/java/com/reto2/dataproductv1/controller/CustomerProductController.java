package com.reto2.dataproductv1.controller;

import com.reto2.dataproductv1.repository.entity.CustomerProductEntity;
import com.reto2.dataproductv1.service.CustomerProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/data-product-v1")
public class CustomerProductController {
    @Autowired
    private CustomerProductService customerProductService;

    @GetMapping("/customer/{cic}/product")
    public ResponseEntity<List<CustomerProductEntity>> findByCic(
        @PathVariable("cic") String cic
    ) {
        return new ResponseEntity(customerProductService.findByCic(cic), HttpStatus.OK);
    }

    @GetMapping("/customer/{cic}/product/{tio-aux}")
    public ResponseEntity<CustomerProductEntity> findByCicTioAux(
        @PathVariable("cic") String cic,
        @PathVariable("tio-aux") String tioAux
    ) {
        return new ResponseEntity(customerProductService.findByCicTioAux(cic, tioAux), HttpStatus.OK);
    }
}
