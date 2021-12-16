package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentsController {
    @GetMapping("")
    public String show(){
        return "index";
    }

    @PostMapping("")
    public String choose(@RequestParam(name = "condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);

        return "index";
    }
}
