package com.lari.JobPortal.Controller;

import com.lari.JobPortal.Model.Post;
import com.lari.JobPortal.repository.PostRepository;
import com.lari.JobPortal.repository.searchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository postrepo;

    @Autowired
    searchRepository search;

    @GetMapping("allPosts")
    public List<Post> getAllPosts()
    {
        return postrepo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
     return search.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return postrepo.save(post);
    }
}
