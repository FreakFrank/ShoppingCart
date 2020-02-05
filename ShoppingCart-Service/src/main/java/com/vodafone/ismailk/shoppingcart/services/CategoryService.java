package com.vodafone.ismailk.shoppingcart.services;




import com.vodafone.ismailk.shoppingcart.model.ServiceCategory;

import java.util.List;

public interface CategoryService {

    ServiceCategory save(ServiceCategory repoServiceCategory);

    List<ServiceCategory> getAllCategories();

}
