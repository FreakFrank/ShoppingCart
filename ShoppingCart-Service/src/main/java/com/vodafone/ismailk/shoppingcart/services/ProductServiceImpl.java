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

        products.forEach(product ->
                serviceProducts.add(MappingObject.getInstance().map(product, ServiceProduct.class)));

        return serviceProducts;

    }

    @Override
    public ServiceProduct save(ServiceProduct product) {

        Product product1 = MappingObject.getInstance().map(product, Product.class);
        return MappingObject.getInstance().map(productRepository.save(product1), ServiceProduct.class);

    }


}
