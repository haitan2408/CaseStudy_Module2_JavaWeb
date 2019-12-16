package com.codegymdanang.casestudy.controllers;

import com.codegymdanang.casestudy.entity.FuramaKhachHang;
import com.codegymdanang.casestudy.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/dangkykhachhang")
    public String getTrangDangKy(Model model){
        model.addAttribute("khachhang", new FuramaKhachHang());
        return "khachhang/trangdangky";
    }

    @PostMapping("/dangky")
    public String saveKhachHang(@Valid @ModelAttribute("khachhang")FuramaKhachHang furamaKhachHang, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println("hello");
            return "khachhang/trangdangky";
        }else {
            khachHangService.saveKhachHang(furamaKhachHang);
            return "khachhang/dangkythanhcong";
        }


    }
}
