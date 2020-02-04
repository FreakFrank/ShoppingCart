package com.vodafone.ismailk.shoppingcart.models;


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
    @Column(name = "category_id")
    private Long categoryID;

    private String name;

    @Column(name = "last_update")
    private Date lastUpdate;

    @OneToMany(targetEntity=Product.class, mappedBy="category", fetch=FetchType.EAGER)
    private List<Product> product;


}
