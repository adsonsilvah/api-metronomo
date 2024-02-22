package com.example.apimetronomo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/metronomo")
public class MetronomoController {

    @GetMapping("")
    public String getBpm(){
        return "hello world";
    }
}
