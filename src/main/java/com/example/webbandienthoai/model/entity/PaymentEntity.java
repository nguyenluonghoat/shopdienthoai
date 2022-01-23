package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Table(name="PAYMENT")
@Entity
public class PaymentEntity extends BaseEntity{
    @ManyToOne
    private UserEntity userId;
    private Integer amount;
    private String status;
    private Integer totalItem;
}
