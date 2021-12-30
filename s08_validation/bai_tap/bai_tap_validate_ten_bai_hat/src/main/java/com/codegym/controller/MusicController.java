package com.codegym.controller;

import com.codegym.dto.MusicDto;
import com.codegym.model.Music;
import com.codegym.service.imp.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    MusicService musicService;
    @GetMapping("")
    public String viewPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Music> musicPage = musicService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("musicPage", musicPage);
        return "/view";
    }
    @GetMapping("create")
    public String createPage (Model model){
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping ("create")
    public String createNewMusic (@Valid @ModelAttribute("music") MusicDto musicDto, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new MusicDto().validate(musicDto, bindingResult);
        if(bindingResult.hasErrors()){
            return "/create";
        }
        musicService.save(musicDto);
        redirectAttributes.addFlashAttribute("msg","Create new Music successful!");
        return "redirect: ";
    }
    @GetMapping("edit")
    public String editPage(@RequestParam("id")Integer id,Model model){
        model.addAttribute("music",musicService.findById(id));
        return "/edit";
    }
    @PostMapping("edit")
    public String editMusic (@Valid @ModelAttribute("music") MusicDto musicDto, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new MusicDto().validate(musicDto, bindingResult);
        if(bindingResult.hasErrors()){
            return "/create";
        }
        musicService.save(musicDto);
        redirectAttributes.addFlashAttribute("msg","Edit Music successful!");
        return "redirect: ";
    }
}
