package com.api_restful_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api_restful_mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
