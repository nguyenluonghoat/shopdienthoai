package com.example.webbandienthoai.model.request;

import lombok.Data;

@Data
public class UserRequest {
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
