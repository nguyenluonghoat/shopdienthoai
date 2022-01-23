package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "Brand")
@Entity
public class BrandEntity extends BaseEntity{
}
