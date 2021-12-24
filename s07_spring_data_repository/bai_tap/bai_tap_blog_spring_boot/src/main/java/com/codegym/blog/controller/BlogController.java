package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.IBlogService;
import com.codegym.blog.service.imp.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String listViewPage(Model model){
        model.addAttribute("blogList", blogService.findALL());
        return "view";
    }

    @GetMapping("create")
    public String createPage (Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping ("create")
    public String createNewBlog (@ModelAttribute ("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg","Create Blog successfully!");
        return "redirect: ";
    }

    @GetMapping("delete")
    public String deleteBlog(@RequestParam("id")int id,RedirectAttributes redirectAttributes){
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("msg","Delete Blog successfully!");
        return "redirect: ";
    }

    @GetMapping("edit")
    public String editPage (@RequestParam("id")Integer id, Model model){
        model.addAttribute("product",blogService.findById(id));
        return "edit";
    }

}