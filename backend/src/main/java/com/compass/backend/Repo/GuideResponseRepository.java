package com.compass.backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.compass.backend.Models.GuideModel;

public interface GuideResponseRepository extends MongoRepository<GuideModel,String> {

    
}
