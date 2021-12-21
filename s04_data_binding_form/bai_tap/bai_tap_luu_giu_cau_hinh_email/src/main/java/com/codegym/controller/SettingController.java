package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingController {
    @Autowired
    private ISettingService settingService;

    @GetMapping("")
    public String show(Model model){
        String[] language = {"English", "Vietnamese", "Japanese", "Chinese"};
        String[] pageSize = {"5", "10", "15", "25", "50", "100"};
        model.addAttribute("setting",new Setting());
        model.addAttribute("language",language);
        model.addAttribute("pageSize",pageSize);
        return "index";
    }

    @PostMapping("")
    public String update(@ModelAttribute("setting") Setting setting){
        settingService.save(setting);
        return "index";
    }
}
