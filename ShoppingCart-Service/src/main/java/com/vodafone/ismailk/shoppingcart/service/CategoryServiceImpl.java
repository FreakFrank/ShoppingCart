package com.vodafone.ismailk.shoppingcart.service;


import com.vodafone.ismailk.shoppingcart.model.Category;
import com.vodafone.ismailk.shoppingcart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {

        List<Category> categories = new ArrayList<>();

        return categories;
    }


}
