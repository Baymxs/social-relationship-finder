package ru.nsu.bayramov.socialrelationshipfinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1/social-relationship-finder")
public class WebController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}