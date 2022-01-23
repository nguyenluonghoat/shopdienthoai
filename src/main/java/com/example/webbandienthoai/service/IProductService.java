package com.example.webbandienthoai.service;

import com.example.webbandienthoai.model.respone.ProductResponse;
import org.springframework.data.domain.Page;

import java.util.List;


public interface IProductService{

    List<ProductResponse> getAll();

    List<ProductResponse> findPicture();

    Page<ProductResponse> page(Integer indexPage, Integer size);
}
