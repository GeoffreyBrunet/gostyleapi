package com.thegeoffreybrunet.gostyleapi.web.Controller;

import com.thegeoffreybrunet.gostyleapi.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ProductController {

    @GetMapping("/api/product")
    public Product getProduct(){
        Product product = new Product("tshirt", 10.10, "url");
        return product;
    }

}
