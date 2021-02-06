package com.reto2.dataproductv1.repository;

import com.reto2.dataproductv1.repository.entity.ProductEntity;
import com.reto2.dataproductv1.repository.entity.key.ProductEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, ProductEntityKey> {
}
