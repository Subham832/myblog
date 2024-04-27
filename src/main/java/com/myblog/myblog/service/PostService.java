package com.myblog.myblog.service;

import com.myblog.myblog.payload.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostDto findPostById(long id);

    PostDto getPostById(long id);
}
