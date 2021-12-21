package com.codegym.controller;

import com.codegym.service.IProductManagerService;
import com.codegym.service.imp.ProductManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManagerController {
    @Autowired
    private IProductManagerService productManagerService;

    @GetMapping("")
    public String getPageView(Model model){

        model.addAttribute("productList",productManagerService.getProdutList());
        return "view";
    }
}
