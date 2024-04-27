package com.myblog.myblog.service.impl;

import com.myblog.myblog.entity.Post;
import com.myblog.myblog.exception.ResourceNotFoundException;
import com.myblog.myblog.payload.PostDto;
import com.myblog.myblog.repository.PostRepository;
import com.myblog.myblog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository; //Instead of Autowired we can also use Constructor based injection.

    public PostServiceImpl(PostRepository postRepository) { //Constructor Based Injection.
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) { //we can't send and save the data by Dto we can save by Post. So, we have to send Dto data to Post then only the data will save to the database,
        Post post = new Post(); //Inserting the data
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post); // After saving the data we can't see by Post we have to see by Dto. For this have to change the Post to Dto.

        PostDto dto = new PostDto(); //Displaying the data
        dto.setId(savedPost.getId());
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }

    @Override
    public PostDto findPostById(long id) {//In this method we are finding only id
        Post post = postRepository.findById(id).get();
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

}
