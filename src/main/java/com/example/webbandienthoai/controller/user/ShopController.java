package com.example.webbandienthoai.controller.user;

import com.example.webbandienthoai.model.entity.ProductEntity;
import com.example.webbandienthoai.model.respone.ProductResponse;
import com.example.webbandienthoai.repository.ProductRepository;
import com.example.webbandienthoai.service.IProductService;
import org.hibernate.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cms-user-listProduct")
public class ShopController {

    private final ProductRepository iProductRepository;



    private final IProductService iProductService;

    public ShopController(IProductService iProductService,ProductRepository productRepository) {
        this.iProductService = iProductService;
        this.iProductRepository=productRepository;
    }


//    //Phan trang
//    @GetMapping
//    public ResponseEntity<List<ProductResponse>> getPage(@Parameter(name = "pageIndex") Integer pageIndex,
//                                                         @Parameter(name = "size") Integer size) {
//        return ResponseEntity.ok(iProductService.ge)
//    }



    @RequestMapping()
    public String getListb(Model model){
        List<ProductResponse> list=iProductService.findPicture();
        model.addAttribute("listProduct",list);
        //list bao gồm picture.
        return "user/shop";
    }



}
