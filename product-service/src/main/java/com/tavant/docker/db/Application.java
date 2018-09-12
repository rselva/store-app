package com.tavant.docker.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tavant.docker.db.entity.Model;
import com.tavant.docker.db.repository.ModelRepository;

//@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ModelRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Model("v3.0","123", "LogRegModel"));
		repository.save(new Model("v3.0","124", "LogRegModel"));

		System.out.println("-------------------------------");
		for (Model model : repository.findAll()) {
			System.out.println(model);
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println(repository.findByModelId("123"));

		System.out.println("--------------------------------");
		for (Model model : repository.findByVersion("v3.0")) {
			System.out.println(model);
		}

	}

}
