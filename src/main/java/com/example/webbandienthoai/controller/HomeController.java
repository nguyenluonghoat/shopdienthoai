package com.example.webbandienthoai.controller;

import com.example.webbandienthoai.model.respone.UserRespone;
import com.example.webbandienthoai.service.IUserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping
public class HomeController {
    private final IUserService iUserService;

    public HomeController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping(value = {"/","/index"})
    public String index(Model model, @RequestParam(defaultValue ="")String  name){

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserRespone userRespone = iUserService.findByUserName(userDetails.getUsername());
        model.addAttribute("user",userRespone);
        return "user/index";
    }
}
