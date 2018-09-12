package com.tavant.docker.db.entity;

import org.springframework.data.annotation.Id;

public class Model {

    @Id
    private String id;

    private String version;
    private String modelId;
    private String name;

    public Model() {}

    public Model(String version, String modelId, String name) {
        super();
        this.version = version;
        this.modelId = modelId;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model [id=" + id + ", version=" + version + ", modelId=" + modelId + ", name=" + name + "]";
    }


}

