package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Table(name = "ORDERITEM")
@Entity
public class OrderItemEntity extends BaseEntity{
    private Integer quantity;

    private Integer productId;
    @ManyToOne
    private PaymentEntity paymentId;
}

