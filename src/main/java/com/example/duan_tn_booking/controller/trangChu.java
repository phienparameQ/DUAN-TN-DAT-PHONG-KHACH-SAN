package com.example.duan_tn_booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
@Controller
public class trangChu {


    @GetMapping("/trang-chu")
    public String hienThi(){
        return "home";
    }
}
