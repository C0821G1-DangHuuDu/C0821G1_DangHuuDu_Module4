package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.User;
import com.codegym.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String listViewPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<User> userPage = userService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("userPage", userPage);
        return "/view";
    }

    @GetMapping("create")
    public String createPage(Model model){
        model.addAttribute("user", new UserDto());
        return "/create";
    }

    @PostMapping("create")
    public String createNewUser(@Valid @ModelAttribute("user")UserDto userDto, RedirectAttributes redirectAttributes){
        userService.createNewUser(userDto);
        redirectAttributes.addFlashAttribute("msg","Create new User successful!");
        return "redirect: ";
    }
}