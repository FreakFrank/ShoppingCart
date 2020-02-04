package com.vodafone.ismailk.shoppingcart.service;

import com.vodafone.ismailk.shoppingcart.model.Product;
import com.vodafone.ismailk.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {

        // TODO map repository model to service model
        //return  productRepository.findAll();
        return null;
    }

    @Override
    public void save(Product product) {
        // TODO map passed model to repository model
        //productRepository.save(product);
    }


}
