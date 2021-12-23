package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductManagerService;
import com.codegym.service.imp.ProductManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductManagerController {
    @Autowired
    private IProductManagerService productManagerService;

    @GetMapping("")
    public String getPageView(Model model){
        model.addAttribute("productList",productManagerService.getProdutList());
        return "view";
    }

    @GetMapping("create")
    public String createPageView(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("create")
    public String createProduct(@ModelAttribute("product")Product product, Model model){
        productManagerService.saveNewProduct(product);
        model.addAttribute("msg", "Create product successfully!");
        model.addAttribute("productList",productManagerService.getProdutList());
        return "view";
    }

    @GetMapping("delete")
    public String deleteProduct(@RequestParam("id") int id, Model model){
        productManagerService.deleteProduct(id);
        model.addAttribute("productList",productManagerService.getProdutList());
        return "view";
    }

    @GetMapping("edit")
    public String editPageView (@RequestParam("id") int id, Model model){
        model.addAttribute("product",productManagerService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String editProduct(@ModelAttribute("product")Product product,Model model){
        productManagerService.editProduct(product);
        model.addAttribute("productList",productManagerService.getProdutList());
        return "view";
    }
}
