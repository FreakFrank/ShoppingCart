package com.whatever.ShoppingCart.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date last_update;
//    @OneToMany(targetEntity=Product.class, mappedBy="categories", fetch=FetchType.EAGER)
//    private List<Product> products;

}
