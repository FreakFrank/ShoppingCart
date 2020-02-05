package com.vodafone.ismailk.shoppingcart.controllers;

import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("getAllCategories")
    public ResponseEntity<List<ServiceCategory>> getAllCategories(){

        List<ServiceCategory> allCategories = categoryService.getAllCategories();

        return new ResponseEntity<>(allCategories, (allCategories.size() > 0) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "addCategory")
    public ResponseEntity<Boolean> addCategory(@ModelAttribute ServiceCategory serviceCategory){

        ServiceCategory save = categoryService.save(serviceCategory);
        return new ResponseEntity<>( save != null, (save != null) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);

    }

}
