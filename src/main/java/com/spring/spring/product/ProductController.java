package com.spring.spring.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
// @RequestMapping()
public class ProductController {
    List<product> pro = new ArrayList<product>();
    @GetMapping("/pro")
    public List<product> getProduct() {
        return pro;
    }
    @GetMapping("/create")
    public void createProduct() {
        pro.add(new product(0, "cake"));
    }
    
}
