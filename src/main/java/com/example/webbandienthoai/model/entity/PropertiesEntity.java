package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "PROPERTIES")
@Entity
public class PropertiesEntity extends BaseEntity{
    private String color;
    private String media;
    private String picture;
}
