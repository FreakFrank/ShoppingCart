package com.vodafone.ismailk.shoppingcart;


import com.vodafone.ismailk.shoppingcart.controllers.CategoryController;
import com.vodafone.ismailk.shoppingcart.controllers.ProductController;
import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;
import com.vodafone.ismailk.shoppingcart.services.CategoryServiceImpl;
import com.vodafone.ismailk.shoppingcart.services.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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

//        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
//
//        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(mockHttpServletRequest));

        ServiceCategory serviceCategory = ObjectsGenerator.generateOneCategory();

        when(categoryService.save(serviceCategory)).thenReturn(serviceCategory);

        ResponseEntity<Boolean> booleanResponseEntity = categoryController.addCategory(serviceCategory);

        assertThat(booleanResponseEntity.getBody()).isTrue();

        assertThat(booleanResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

    }


    @Test
    public void getAllCategories(){

        when(categoryService.getAllCategories()).thenReturn(ObjectsGenerator.generateListOfServiceCategories());

        ResponseEntity<List<ServiceCategory>> allCategories = categoryController.getAllCategories();

        assertThat(allCategories.getBody().size()).isEqualTo(5);

    }

    @Test
    public void addProduct(){
        ServiceProduct serviceProduct = ObjectsGenerator.gerateOneProduct();

        when(productService.save(serviceProduct)).thenReturn(serviceProduct);

        ResponseEntity<Boolean> booleanResponseEntity = productController.addProduct(serviceProduct);

        assertThat(booleanResponseEntity.getBody()).isTrue();

        assertThat(booleanResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void getAllProducts(){
        List<ServiceProduct> serviceProductList = ObjectsGenerator.generateListOfProducts();

        when(productService.getAllProducts()).thenReturn(serviceProductList);

        ResponseEntity<List<ServiceProduct>> allProducts = productController.getAllProducts();

        assertThat(allProducts.getBody()).hasSize(5);

        assertThat(allProducts.getStatusCode()).isEqualTo(HttpStatus.OK);
    }




}
