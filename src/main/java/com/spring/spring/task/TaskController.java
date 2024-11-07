package com.spring.spring.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Task04")
public class TaskController {
    @GetMapping("/task1")
    public String getTask1(Model model) {
        model.addAttribute("variable", "Hello");
        return "task/task01";
    }
}