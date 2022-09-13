package com.example.btgmail.controller;


import com.example.btgmail.model.Gmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GmailController {

    @ModelAttribute("gmail")
    public Gmail alolo(){
        return new Gmail();
    }
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("gmail",new Gmail());
        return modelAndView;
    }


    @PostMapping("/view")
    public ModelAndView view(@ModelAttribute("gmail") Gmail gmail){
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("languages",gmail.getLanguages());
        modelAndView.addObject("pageSize",gmail.getSize());
        modelAndView.addObject("filter",gmail.isFilter());
        modelAndView.addObject("signature",gmail.getSignature());
        return modelAndView;
    }
}
