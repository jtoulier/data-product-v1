package com.reto2.dataproductv1.repository;

import com.reto2.dataproductv1.repository.entity.CustomerProductEntity;
import com.reto2.dataproductv1.repository.entity.key.CustomerProductEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProductEntity, CustomerProductEntityKey> {
    List<CustomerProductEntity> findByCustomerProductEntityKeyCic(String cic);
}
