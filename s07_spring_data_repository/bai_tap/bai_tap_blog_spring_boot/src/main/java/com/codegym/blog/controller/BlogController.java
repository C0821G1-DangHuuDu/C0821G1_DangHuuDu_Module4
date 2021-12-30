package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.IBlogService;
import com.codegym.blog.service.imp.BlogService;
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

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String listViewPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Blog> blogPage = blogService.findAll(PageRequest.of(page,5,sort));
        model.addAttribute("blogPage", blogPage);
        return "/view";
    }

    @GetMapping("create")
    public String createPage (Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }

    @PostMapping ("create")
    public String createNewBlog (@ModelAttribute ("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg","Create Blog successfully!");
        return "redirect: ";
    }

    @GetMapping("delete")
    public String deleteBlog(@RequestParam("id")int id,Model model){
        blogService.remove(id);
        model.addAttribute("msg",blogService.findALL());
        return "/view";
    }

    @GetMapping("edit")
    public String editPage (@RequestParam("id")Integer id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "/edit";
    }

    @PostMapping ("edit")
    public String editBlog (@ModelAttribute ("blog")Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg","Edit Blog successfully!");
        return "redirect: ";
    }

    @PostMapping("find")
    public String findByName(@RequestParam("nameFind")String name,Model model){
        model.addAttribute("blogList", blogService.findByName(name));
        return "/view";
    }


}
