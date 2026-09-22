package com.speakabout.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/command")
@RestController
public class CommandController {

    @GetMapping("/test")
    public String test(){
        return "Backend is live now.";
    }
}
