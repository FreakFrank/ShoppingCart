package com.vodafone.ismailk.shoppingcart.repository;


import com.vodafone.ismailk.shoppingcart.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
