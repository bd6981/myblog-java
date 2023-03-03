package com.mycompany.myblog.controller;


import com.mycompany.myblog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mycompany.myblog.service.PostService;
import java.util.List;
@RequestMapping("api/v1/post")
@RestController
public class PostController {

    private final PostService postService;
    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }
    @PostMapping
    public void addPost (@RequestBody Post post){
        postService.addPost(post);
    }
    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}
