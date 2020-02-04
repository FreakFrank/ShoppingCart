package com.vodafone.ismailk.shoppingcart.services;

import com.vodafone.ismailk.shoppingcart.model.Product;
import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;
import com.vodafone.ismailk.shoppingcart.repository.ProductRepository;
import com.vodafone.ismailk.shoppingcart.utilities.MappingObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ServiceProduct> getAllProducts() {

       List<Product> products = (List<Product>) productRepository.findAll();

       List<ServiceProduct> serviceProducts = new ArrayList<>();

        for (Product product : products) {
            serviceProducts.add(MappingObject.getInstance().map(product, ServiceProduct.class));
        }

        return serviceProducts;

    }

    @Override
    public void save(ServiceProduct product) {

        Product product1 = MappingObject.getInstance().map(product, Product.class);
        productRepository.save(product1);

    }


}