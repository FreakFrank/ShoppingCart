package com.vodafone.ismailk.shoppingcart;

import com.vodafone.ismailk.shoppingcart.controllers.CategoryController;
import com.vodafone.ismailk.shoppingcart.controllers.ProductController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGetMethods {

    @Spy
    CategoryController categoryController;

    @Mock
    ProductController productController;

    @Test
    public void testCategoryGetMethod(){

        Assertions.assertTrue(categoryController.getAllCategories().size() > 0);

    }

}
