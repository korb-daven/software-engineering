package com.spring.spring.user;
import ch.qos.logback.core.model.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }
    
}