package com.tavant.docker.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tavant.docker.db.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    public List<Product> findAll();
    public Optional<Product> findById(String id);
    public List<Product> findAllByName(String name);
    

}
