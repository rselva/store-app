package com.tavant.docker.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tavant.docker.db.entity.Product;
import com.tavant.docker.db.repository.ProductRepository;

//@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Product("Car",2000.0));
		repository.save(new Product("Pen", 20.20));

		System.out.println("-------------------------------");
		for (Product product : repository.findAll()) {
			System.out.println(product);
		}
		System.out.println();

		 

		System.out.println("--------------------------------");
		for (Product model : repository.findAllByName("Car")) {
			System.out.println(model);
		}

	}

}
