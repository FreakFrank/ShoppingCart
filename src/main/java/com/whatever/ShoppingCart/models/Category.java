package com.whatever.ShoppingCart.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "categories")
@Table(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    private String name;
    private Date last_update;

    @OneToMany(targetEntity=Product.class, mappedBy="product_id", fetch=FetchType.EAGER)
    private List<Product> product;

}
