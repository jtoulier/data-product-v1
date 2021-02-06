package com.reto2.dataproductv1.repository.entity;

import com.reto2.dataproductv1.repository.entity.key.ProductEntityKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "product", name = "product")
public class ProductEntity {
    @Embedded
    @Id
    private ProductEntityKey productEntityKey;

    private String description;
}
