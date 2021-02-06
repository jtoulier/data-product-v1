package com.reto2.dataproductv1.repository.entity;

import com.reto2.dataproductv1.repository.entity.key.CustomerProductEntityKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "product", name = "customer_product")
public class CustomerProductEntity {
    @EmbeddedId
    private CustomerProductEntityKey customerProductEntityKey;

    private String details;
}
