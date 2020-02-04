package com.vodafone.ismailk.shoppingcart.controllers;



import com.vodafone.ismailk.shoppingcart.model.Product;
import com.vodafone.ismailk.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("getAllProducts")
    public List<Product> getAllProducts(){
        return null;
        //return productService.getAllProducts();
    }


    @PostMapping(value ="addProduct")
    public void addProduct(@ModelAttribute Product product){
        productService.save(product);
    }


}
