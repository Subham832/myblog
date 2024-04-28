package com.myblog.myblog.controller;

import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping //To Insert The Data To The DataBase
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
    @GetMapping("/particular") //In this we are find id with throwing exceptions and handling exception
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){
       PostDto dto =  postService.getPostById(id);
       return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    //http://localhost:8080/api/posts/toReadAllData?id=1
    @GetMapping("/toReadAllData") //Read All The Data From DataBase
    public List<PostDto> getAllPosts(){
        List<PostDto> postDtos = postService.getAllPosts();
        return postDtos;
    }
    //http://localhost:8080/api/posts/pageableConcept?pageNo=0&pageSize=3&sortBy=title&sortDir=desc
    @GetMapping("/pageableConcept") //Read All The Data From DataBase By Pageable Concept
    public List<PostDto> getAllPostsAsPageable(
            @RequestParam(name = "pageNo", required = false, defaultValue = "0") int pageNo,
            @RequestParam(name = "pageSize", required = false, defaultValue = "3") int pageSize,
            @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sortBy,
            @RequestParam(name = "sortDir", required = false, defaultValue = "id") String sortDir
    ){
        List<PostDto> postDtos = postService.getAllPostsAsPageable(pageNo, pageSize,sortBy,sortDir);
        return postDtos;
    }

}
