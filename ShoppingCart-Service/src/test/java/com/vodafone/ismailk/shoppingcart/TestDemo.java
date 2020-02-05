package com.vodafone.ismailk.shoppingcart;


import com.vodafone.ismailk.shoppingcart.services.CategoryService;
import com.vodafone.ismailk.shoppingcart.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootConfiguration
@SpringBootTest
public class TestDemo {

    @Spy
    CategoryService categoryService;

    @Spy
    ProductService productService;

    @Test
    public void testProductsData(){
        Assertions.assertTrue(productService.getAllProducts().size() > 0);
    }

    @Test
    public void testCategoriesData(){
        Assertions.assertTrue(categoryService.getAllCategories().size() > 0);
    }

}
