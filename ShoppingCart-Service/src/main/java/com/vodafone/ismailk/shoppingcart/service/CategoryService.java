package com.vodafone.ismailk.shoppingcart.service;



import com.vodafone.ismailk.shoppingcart.model.Category;

import java.util.List;

public interface CategoryService {

    Category save(Category category);

    List<Category> getAllCategories();

}
