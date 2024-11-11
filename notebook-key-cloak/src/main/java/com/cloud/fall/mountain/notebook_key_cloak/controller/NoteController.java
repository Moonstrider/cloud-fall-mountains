package com.cloud.fall.mountain.notebook_key_cloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("")
public class NoteController {

    @GetMapping("/private/note")
    public String getNotes() {
        return "private note";
    }

    @GetMapping("/public/note")
    public String note() {
        return "All notes";
    }

//    @GetMapping("/login")
//    public String login() {
//        return "Logging in...";
//    }

    @GetMapping("/old-url")
    public String redirect() {
        return "redirect:/new-url";
    }

}
