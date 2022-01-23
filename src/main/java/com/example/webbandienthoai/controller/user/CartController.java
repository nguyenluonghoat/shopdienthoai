package com.example.webbandienthoai.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cms-user-cart")
public class CartController {
    @GetMapping()
    public String cart(Model model, @RequestParam(defaultValue = "")String name){
        model.addAttribute("name",name);
        return "user/cart";
    }
}
