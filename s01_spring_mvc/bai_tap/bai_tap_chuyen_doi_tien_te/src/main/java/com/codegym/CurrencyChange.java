package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyChange {
    @GetMapping("")
    public String currency(){
        return "index";
    }

    @PostMapping("")
    public String currencyChange (@RequestParam(name = "usd") int usd, Model model) {
        model.addAttribute("vnd",usd*22000);
        return "index";
    }
}
