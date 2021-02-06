package com.reto2.dataproductv1.repository.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductEntityKey  implements Serializable {
    @Column(name = "tio_aux")
    private String tioAux;
}
