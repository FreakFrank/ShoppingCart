package com.vodafone.ismailk.shoppingcart.model;


import com.vodafone.ismailk.shoppingcart.model.Category;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

@Data
public class ServiceProduct implements Serializable {

    private Long productID;
    private String code;
    private String description;
    private int quantity;
    private double price;
    private MultipartFile image;
    private Date last_update;
    private Category category;

}
