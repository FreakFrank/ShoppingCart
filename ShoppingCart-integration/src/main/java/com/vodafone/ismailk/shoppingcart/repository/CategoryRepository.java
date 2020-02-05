package com.vodafone.ismailk.shoppingcart.repository;

import com.vodafone.ismailk.shoppingcart.model.Category;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
