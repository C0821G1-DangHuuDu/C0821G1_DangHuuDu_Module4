package com.codegym.controller;

import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {
    @GetMapping("")
    public String show(Model model){
        String[] language = {"English", "Vietnamese", "Japanese", "Chinese"};
        String[] pageSize = {"5", "10", "15", "25", "50", "100"};
        model.addAttribute("setting",new Setting());
        model.addAttribute("language",language);
        model.addAttribute("pageSize",pageSize);
        return "index";
    }
}
