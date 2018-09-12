package com.tavant.docker.db.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product {

    @Id
    private String id;

    private String name;
    
    private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
   
    
}