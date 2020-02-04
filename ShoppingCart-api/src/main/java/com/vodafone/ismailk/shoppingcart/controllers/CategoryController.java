package com.vodafone.ismailk.shoppingcart.controllers;

import com.vodafone.ismailk.shoppingcart.model.Category;
import com.vodafone.ismailk.shoppingcart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("getAllCategories")
    public List<Category> getAllCategories(){
        //return categoryService.getAllCategories();
        return null;
    }

}