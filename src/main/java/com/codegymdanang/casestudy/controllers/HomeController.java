package com.codegymdanang.casestudy.controllers;

import com.codegymdanang.casestudy.entity.FuramaFavorite;
import com.codegymdanang.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("favorite")
public class HomeController {

    @Autowired
    DichVuService dichVuService;

    @GetMapping("/")
    public ModelAndView getHomePage(@RequestParam(value = "fromPrice", required = false) Integer fromPrice
                                    ,@RequestParam(value = "toPrice", required = false) Integer toPrice)
    {
        ModelAndView modelAndView = new ModelAndView("home/index");
        if (fromPrice == null || toPrice == null){
            modelAndView.addObject("listdichvu", dichVuService.getAllDichVu());
        }else {
            modelAndView.addObject("listdichvu",dichVuService.findAllByChiPhiThueBetween(fromPrice,toPrice));
        }
        return modelAndView;
    }

    @GetMapping("/dichvu/{id}")
    public ModelAndView getDichVuDetail(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("dichvu/dichvuchitiet");
        modelAndView.addObject("dichvuchitiet", dichVuService.getDichVu(id));
        return modelAndView;
    }

    @GetMapping("/favorite/{id}")
    public String saveSessionFavorite(@PathVariable long id, @ModelAttribute("favorite") FuramaFavorite sessionFavorite){

        sessionFavorite.add(dichVuService.getDichVu(id));

        return "redirect:/";
    }

    @GetMapping("/favoritePage")
    public String getFavoritePage(){
        return "home/favorite";
    }

    //setup Session favorite
    @ModelAttribute("favorite")
    public FuramaFavorite setupSession(){
        return new FuramaFavorite();
    }




}
