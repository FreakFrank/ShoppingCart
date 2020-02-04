package com.vodafone.ismailk.shoppingcart.controllers;



import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;
import com.vodafone.ismailk.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("getAllProducts")
    public List<ServiceProduct> getAllProducts(){
        return productService.getAllProducts();
    }


    @PostMapping(value ="addProduct")
    public void addProduct(@ModelAttribute ServiceProduct product){
        productService.save(product);
    }


}
