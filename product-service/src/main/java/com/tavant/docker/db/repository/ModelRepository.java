package com.tavant.docker.db.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tavant.docker.db.entity.Model;

public interface ModelRepository extends MongoRepository<Model, String> {

    public List<Model> findByVersion(String version);
    public Model findByModelId(String name);

}
