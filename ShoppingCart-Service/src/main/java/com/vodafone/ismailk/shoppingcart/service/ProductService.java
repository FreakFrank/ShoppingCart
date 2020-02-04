package com.vodafone.ismailk.shoppingcart.service;


import com.vodafone.ismailk.shoppingcart.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void save(Product product);
}
