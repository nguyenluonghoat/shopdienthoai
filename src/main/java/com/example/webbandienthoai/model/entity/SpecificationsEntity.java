package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "SPECIFICATIONS")
@Entity
public class SpecificationsEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String CPU;
    private String screen;
    private String RAM;
    private float width;
    private float depth;
    private String material;
    private String resolution;
    private String scanFrequecy;
    private String GPU;
    private String camera;
}
