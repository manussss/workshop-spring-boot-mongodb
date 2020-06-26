package com.javacourse.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javacourse.course.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	

}
