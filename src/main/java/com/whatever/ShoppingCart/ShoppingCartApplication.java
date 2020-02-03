package com.whatever.ShoppingCart;

import com.whatever.ShoppingCart.models.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.Date;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingCartApplication.class, args);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("punit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Category category = new Category();

		category.setName("Clothes");
		category.setLast_update(new Date());

		entityManager.persist(category);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}

}
