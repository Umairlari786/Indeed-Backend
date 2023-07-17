package com.lari.JobPortal.repository;

import com.lari.JobPortal.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
