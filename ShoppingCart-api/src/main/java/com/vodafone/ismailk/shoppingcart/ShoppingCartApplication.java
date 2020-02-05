package com.vodafone.ismailk.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.vodafone.ismailk.shoppingcart.services",
		"com.vodafone.ismailk.shoppingcart.controllers"})
@EntityScan(basePackages = {"com.vodafone.ismailk.shoppingcart.model"})
@EnableJpaRepositories(basePackages = {"com.vodafone.ismailk.shoppingcart.repository"})
public class ShoppingCartApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingCartApplication.class, args);

	}

}
