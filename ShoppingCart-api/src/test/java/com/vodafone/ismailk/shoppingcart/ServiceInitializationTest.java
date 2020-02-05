package com.vodafone.ismailk.shoppingcart;

import com.vodafone.ismailk.shoppingcart.services.CategoryService;
import com.vodafone.ismailk.shoppingcart.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class ServiceInitializationTest {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Test
    public void categoryServiceLoaded() throws Exception{
        assertThat(categoryService).isNotNull();
    }


    @Test
    public void productServiceLoaded() throws Exception{
        assertThat(productService).isNotNull();
    }

}
