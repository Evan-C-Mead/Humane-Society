package com.example.humanesociety.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "Welcome to The Humane Society");
        return "index";
    }


}
