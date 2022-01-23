package com.example.webbandienthoai.service;



import com.example.webbandienthoai.model.request.UserRequest;
import com.example.webbandienthoai.model.respone.UserRespone;


import java.util.List;

public interface IUserService {

    List<UserRespone> getList();

    UserRespone insert(UserRequest userRequest);

    UserRespone findByUserName(String username);
}
