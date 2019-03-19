package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String getProducts(@RequestParam(name = "name", required = false, defaultValue = "Hello") String name, Model model) {
        model.addAttribute("name", name);
        return "product";
    }
}
