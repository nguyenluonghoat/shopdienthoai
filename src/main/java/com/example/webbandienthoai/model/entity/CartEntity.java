package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "CART")
@Entity
public class CartEntity extends BaseEntity{
    private String userName;
    private Integer userId;

    private Integer idProduct;
}
