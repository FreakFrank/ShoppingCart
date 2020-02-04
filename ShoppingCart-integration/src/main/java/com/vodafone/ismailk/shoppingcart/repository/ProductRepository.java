package com.vodafone.ismailk.shoppingcart.repository;


import com.vodafone.ismailk.shoppingcart.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
