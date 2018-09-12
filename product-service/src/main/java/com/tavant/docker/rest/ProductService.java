package com.tavant.docker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.docker.db.entity.Product;
import com.tavant.docker.db.repository.ProductRepository;

@RestController
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/product")
	public List<Product> getAll(){
		return repository.findAll();
	}
	
	@GetMapping("/product/create")
	public String createFew(){
		repository.save(new Product("Car",2000.0));
		repository.save(new Product("Pen", 20.20));

		return "Ok";
	}
	
	
	
	
}
