package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "ROLE")
@Entity
public class RoleEntity extends BaseEntity{
}
