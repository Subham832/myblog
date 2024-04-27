package com.myblog.myblog.controller;

import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/posts?id=1
    @GetMapping //In this method we are finding only id
    public ResponseEntity<PostDto> findPostById(@RequestParam long id){
        PostDto dtos = postService.findPostById(id);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
    //http://localhost:8080/api/posts/particular?id=1
    @GetMapping("/particular") //In this we are find id with throwing exceptions
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){
       PostDto dto =  postService.getPostById(id);
       return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
