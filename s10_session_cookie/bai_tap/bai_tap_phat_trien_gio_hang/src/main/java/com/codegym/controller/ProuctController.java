package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("productBag")
public class ProuctController {

    @ModelAttribute("productBag")
    public List<Product> createProductBag(){
        return new ArrayList<>();
    }

    @Autowired
    @Qualifier("productService")
    IProductService productService;

    @GetMapping("")
    public String viewPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Product> productPage = productService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("productPage", productPage);
        return "/view";
    }

    @PostMapping("detail/add")
    public String addToProductBag(@RequestParam("quantity")Integer quantity, @RequestParam("id")Integer id,HttpSession httpSession, @ModelAttribute("productBag")List<Product> products, RedirectAttributes redirectAttributes){
        Product product = productService.findById(id);
        product.setQuantity(quantity);
        products.add(product);
        redirectAttributes.addFlashAttribute("msg","Add Product Bag successful!");
        return "redirect:/";
    }
    @GetMapping ("detail")
    public String detailProduct(@RequestParam(name = "id")Integer id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "/detail";
    }
    @GetMapping("product-bag")
    public String productBagPage (@ModelAttribute("productBag")List<Product> products, HttpSession httpSession, Model model){
        Double sum = 0.0;
        for(Product product:products){
            sum += product.getPrice()*product.getQuantity();
        }
        model.addAttribute("sum",sum);
        model.addAttribute("products", products);
        return "/product-bag";
    }

    @GetMapping("product-bag/delete")
    public String deleteProductInProductBag(@RequestParam(name = "id")Integer id,@ModelAttribute("productBag")List<Product> products, RedirectAttributes redirectAttributes){
        for (int i = 0; i< products.size();i++){
            if(products.get(i).getId() == id) {
                products.remove(products.get(i));
                break;
            }
        }
        return "redirect:/product-bag ";
    }

}
