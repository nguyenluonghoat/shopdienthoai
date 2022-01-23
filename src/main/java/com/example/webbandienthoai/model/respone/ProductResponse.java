package com.example.webbandienthoai.model.respone;

import com.example.webbandienthoai.model.entity.PropertiesEntity;
import lombok.Data;

@Data
public class ProductResponse {

    private Integer id;
    private String name;
    private String brand;
    private String capacity;
    private float cost;
    private Integer idPropertie;
    private Integer idSpecification;
    private String picture;



}
