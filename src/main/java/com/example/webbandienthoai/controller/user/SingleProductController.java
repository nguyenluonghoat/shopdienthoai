package com.example.webbandienthoai.controller.user;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cms-user-singleProduct")
public class SingleProductController {
    @GetMapping()
    public String singleProduct(Model model, @RequestParam(defaultValue = "") String name){
        model.addAttribute("name",name);
        return "user/product";
    }
}
