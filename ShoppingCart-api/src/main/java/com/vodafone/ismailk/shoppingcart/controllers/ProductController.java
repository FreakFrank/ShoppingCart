package com.vodafone.ismailk.shoppingcart.controllers;

import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;
import com.vodafone.ismailk.shoppingcart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("getAllProducts")
    public ResponseEntity<List<ServiceProduct>> getAllProducts() {

        List<ServiceProduct> allProducts = productService.getAllProducts();

        return new ResponseEntity<>(allProducts, (allProducts.size() > 0) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value ="addProduct")
    public ResponseEntity<Boolean> addProduct(@ModelAttribute ServiceProduct product){

        ServiceProduct save = productService.save(product);

        return new ResponseEntity<>(save != null, (save != null) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);

    }


}
