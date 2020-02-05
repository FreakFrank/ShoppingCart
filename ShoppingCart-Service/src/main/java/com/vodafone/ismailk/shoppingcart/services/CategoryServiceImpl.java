package com.vodafone.ismailk.shoppingcart.services;


import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.model.Category;
import com.vodafone.ismailk.shoppingcart.repository.CategoryRepository;
import com.vodafone.ismailk.shoppingcart.utilities.MappingObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ServiceCategory save(ServiceCategory serviceCategory) {

        Category catRepo = MappingObject.getInstance().map(serviceCategory, Category.class);
        return MappingObject.getInstance().map(categoryRepository.save(catRepo),ServiceCategory.class);


    }

    @Override
    public List<ServiceCategory> getAllCategories() {

        List<ServiceCategory> categories = new ArrayList<>();
        List<Category> all = (List<Category>) categoryRepository.findAll();

        for (Category category : all) {
            categories.add(MappingObject.getInstance().map(category, ServiceCategory.class));
        }

        return categories;
    }




}
