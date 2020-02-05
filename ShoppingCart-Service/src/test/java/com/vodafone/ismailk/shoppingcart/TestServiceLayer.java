package com.vodafone.ismailk.shoppingcart;


import com.vodafone.ismailk.shoppingcart.model.Category;
import com.vodafone.ismailk.shoppingcart.model.Product;
import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;
import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;
import com.vodafone.ismailk.shoppingcart.repository.CategoryRepository;
import com.vodafone.ismailk.shoppingcart.repository.ProductRepository;
import com.vodafone.ismailk.shoppingcart.services.CategoryServiceImpl;
import com.vodafone.ismailk.shoppingcart.services.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class TestServiceLayer {

    @InjectMocks
    CategoryServiceImpl categoryService;

    @InjectMocks
    ProductServiceImpl productService;

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    ProductRepository productRepository;

    @Test
    public void getAllCategories(){

        List<Category> categoryList = ObjectsGenerator.generateListOfServiceCategories();

        when(categoryRepository.findAll()).thenReturn(categoryList);

        List<ServiceCategory> serviceCategoryList = categoryService.getAllCategories();

        assertThat(serviceCategoryList).hasSize(5);

    }

    @Test
    public void getAllProducts(){

        List<Product> productList = ObjectsGenerator.generateListOfProducts();

        when(productRepository.findAll()).thenReturn(productList);

        List<ServiceProduct> serviceProductList = productService.getAllProducts();

        assertThat(serviceProductList).hasSize(5);

    }

    @Test
    public void saveCategory(){

        ServiceCategory category = ObjectsGenerator.generateOneCategory();

        categoryService.save(category);

        verify(categoryRepository, times(1)).save(any(Category.class));

    }

    @Test
    public void saveProduct(){

        ServiceProduct serviceProduct = ObjectsGenerator.gerateOneProduct();

        productService.save(serviceProduct);

        verify(productRepository, times(1)).save(any(Product.class));

    }

}
