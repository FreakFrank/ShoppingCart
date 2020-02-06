package com.vodafone.ismailk.shoppingcart;

import com.vodafone.ismailk.shoppingcart.model.Category;
import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectsGenerator {

    public static List<ServiceCategory> generateListOfServiceCategories(){
        List<ServiceCategory> categoryList = new ArrayList<>();

        ServiceCategory category = new ServiceCategory();
        category.setCategoryID(1l);
        category.setLastUpdate(new Date());
        category.setName("Motos");

        for (int i = 0; i < 5; i++) {
            categoryList.add(category);
        }

        return categoryList;
    }

    public static List<ServiceProduct> generateListOfProducts(){
        List<ServiceProduct> productList = new ArrayList<>();

        ServiceProduct product = new ServiceProduct();
        product.setCategory(new Category());
        product.setCode("The product");
        product.setDescription("The most amazing product");

        for (int i = 0; i < 5; i++)
            productList.add(product);


        return productList;

    }

    public static ServiceCategory generateOneCategory(){
        ServiceCategory category = new ServiceCategory();

        category.setCategoryID(1l);
        category.setLastUpdate(new Date());
        category.setName("Motos");

        return category;
    }

    public static ServiceProduct gerateOneProduct(){
        ServiceProduct product = new ServiceProduct();

        product.setCategory(new Category());
        product.setCode("The product");
        product.setDescription("The most amazing product");

        return product;
    }


}
