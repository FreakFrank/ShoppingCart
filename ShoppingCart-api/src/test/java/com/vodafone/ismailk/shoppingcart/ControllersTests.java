package com.vodafone.ismailk.shoppingcart;


import com.vodafone.ismailk.shoppingcart.controllers.CategoryController;
import com.vodafone.ismailk.shoppingcart.controllers.ProductController;
import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.services.CategoryServiceImpl;
import com.vodafone.ismailk.shoppingcart.services.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ControllersTests {

    @InjectMocks
    CategoryController categoryController;

    @Mock
    CategoryServiceImpl categoryService;

    @InjectMocks
    ProductController productController;

    @Mock
    ProductServiceImpl productService;

    @Test
    public void addCategory(){

        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();

        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(mockHttpServletRequest));

        when(categoryService.save(any(ServiceCategory.class))).thenReturn(any(ServiceCategory.class));

        ResponseEntity<Boolean> booleanResponseEntity = categoryController.addCategory(ObjectsGenerator.generateOneCategory());

        assertThat(booleanResponseEntity.getBody()).isFalse();
        assertThat(booleanResponseEntity.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);

    }


    @Test
    public void getAllCategories(){

        when(categoryService.getAllCategories()).thenReturn(ObjectsGenerator.generateListOfServiceCategories());

        ResponseEntity<List<ServiceCategory>> allCategories = categoryController.getAllCategories();

        assertThat(allCategories.getBody().size()).isEqualTo(5);

    }

}
