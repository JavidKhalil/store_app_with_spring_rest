package main;

import main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String price){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productRepository.save(product);
        return "saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Product> getAllUsers(){
        return productRepository.findAll();
    }
}
