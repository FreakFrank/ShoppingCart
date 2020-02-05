package com.vodafone.ismailk.shoppingcart.services;



import com.vodafone.ismailk.shoppingcart.model.ServiceProduct;

import java.util.List;

public interface ProductService {

    List<ServiceProduct> getAllProducts();

    ServiceProduct save(ServiceProduct product);
}
