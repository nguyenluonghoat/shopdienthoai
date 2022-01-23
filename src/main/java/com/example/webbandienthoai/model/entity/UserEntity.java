package com.example.webbandienthoai.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table(name="USER")
@Entity
public class UserEntity extends BaseEntity {
    private String username;
    private String hashPass;

    private String lastName;
    private String address;
    private String email;
    private String createDate;
    private String upDate;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user",
    joinColumns = {@JoinColumn(name="user_id")},
            inverseJoinColumns = {@JoinColumn(name ="role_id")})
    private Set<RoleEntity> setRole=new HashSet<>();

}
