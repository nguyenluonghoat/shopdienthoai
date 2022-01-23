package com.example.webbandienthoai.model.request;


import com.example.webbandienthoai.model.entity.PropertiesEntity;
import lombok.Data;

@Data
public class ProductRequest {

    private Integer id;
    private String name;
    private String brand;
    private String capacity;
    private float cost;
    private Integer idPropertie;
    private Integer idSpecification;


}
