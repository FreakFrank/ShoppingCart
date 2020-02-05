package com.vodafone.ismailk.shoppingcart.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddToCartController {

    @PostMapping(value = "addProductToCart")
    public void addToCard(@RequestParam String id) {
        System.out.println(id);
    }
}
