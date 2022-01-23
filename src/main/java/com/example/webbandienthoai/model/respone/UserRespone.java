package com.example.webbandienthoai.model.respone;

import lombok.Data;

@Data
public class UserRespone {
    private Integer id;
    private String name;
    private String hashPass;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String createDate;
    private String update;
}
