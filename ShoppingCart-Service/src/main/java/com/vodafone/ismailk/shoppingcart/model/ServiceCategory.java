package com.vodafone.ismailk.shoppingcart.model;


import com.vodafone.ismailk.shoppingcart.model.Product;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ServiceCategory {

    private Long categoryID;

    private String name;

    private Date lastUpdate;

    private List<Product> product;


}
