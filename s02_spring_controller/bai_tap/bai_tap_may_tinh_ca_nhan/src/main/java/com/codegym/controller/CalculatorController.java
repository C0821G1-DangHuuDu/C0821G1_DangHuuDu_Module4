package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String show(){
        return "index";
    }

    @PostMapping("")
    public String calculator(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2, @RequestParam(name = "action") String action, Model model){
       Integer result;
        if (action.equals("Addition(+)")){
            result = num1 + num2;
        } else if (action.equals("Subtraction(-)")){
            result = num1 - num2;
        } else if (action.equals("Multiplication(x)")){
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
