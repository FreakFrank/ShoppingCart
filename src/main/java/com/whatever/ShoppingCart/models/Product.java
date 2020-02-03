package com.whatever.ShoppingCart.models;


import lombok.Data;
import org.hibernate.annotations.Target;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "products")
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String code;
    private String description;
    private int quantity;
    private double price;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte [] image;

    private Date last_update;

    @ManyToOne(optional = false, targetEntity = Category.class)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Long category_id;

}
