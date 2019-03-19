package main;

import main.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/add")
    public @ResponseBody String addNewProduct(@RequestParam String name, @RequestParam String price){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productRepository.save(product);
        return "saved";
    }

    @GetMapping("/delete")
    public @ResponseBody String deleteProduct(@RequestParam String name){
        Product product = new Product();
        product.setName(name);
        productRepository.delete(product);
        return "deleted";
    }

    @GetMapping("/update")
    public @ResponseBody String updateProduct(@RequestParam String idi, @RequestParam String name, @RequestParam String price){
        Product product = productRepository.findById(Integer.valueOf(idi)).get();
        product.setName(name);
        product.setPrice(price);
        productRepository.save(product);
        return "updated";
    }

    @GetMapping("/select")
    ///^[0-9]*$
    public @ResponseBody String selectProduct(@RequestParam String id) {
        Product product = productRepository.findById(Integer.valueOf(id)).get();
        return "selected";
    }

    @GetMapping("/all")
    public @ResponseBody String getAllUsers(Model model){
        List<Product> productList = productRepository.findAll();
        model.addAttribute("products", productList);
        return "all products selected";
    }
}
