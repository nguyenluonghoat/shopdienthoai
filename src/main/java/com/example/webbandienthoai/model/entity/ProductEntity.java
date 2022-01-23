package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table(name = "PRODUCT")
@Entity
public class ProductEntity extends BaseEntity {
    private String brand;
    private String capacity;
    private float cost;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "brand_product",
    joinColumns = {@JoinColumn(name = "brand_id")},
    inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private Set<ProductEntity> setBrand=new HashSet<>();
    @ManyToOne
    private PropertiesEntity idProperties;
    @ManyToOne
    private SpecificationsEntity idSpecifications;
}
