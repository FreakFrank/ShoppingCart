package com.vodafone.ismailk.shoppingcart.models;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "products")
@Table(name = "products")
@Data
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productID;
    private String code;

    private String description;
    private int quantity;
    private double price;

//    @Lob
//    @Type(type = "org.hibernate.type.BinaryType")
//    @Transient
//    private byte [] image2;

    @Transient
    private MultipartFile image;

    private Date last_update;

    @ManyToOne(optional = false, targetEntity = Category.class)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

}
