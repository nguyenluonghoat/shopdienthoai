package com.example.webbandienthoai.controller.user;

import com.example.webbandienthoai.model.respone.UserRespone;
import com.example.webbandienthoai.service.IUserService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cms-user-information")
public class UserInformationController {

    private final IUserService iUserService;

    public UserInformationController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @RequestMapping()
    public String displayInfo(Model model) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserRespone userRespone = iUserService.findByUserName(userDetails.getUsername());
        model.addAttribute("information",userRespone);

        return "user/information";
    }
}
