package com.codegym.controller.customer;

import com.codegym.model.customer.Customer;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("list")
    public String listEmployee(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Customer> customerPage = customerService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("customerPage", customerPage);
        return "customer/view";
    }
}
