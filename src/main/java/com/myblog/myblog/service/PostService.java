package com.myblog.myblog.service;

import com.myblog.myblog.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);//To Insert The Data To The DataBase

    PostDto findPostById(long id);//In this method we are finding only id

    PostDto getPostById(long id);//In this we are find id with throwing exceptions and handling exception

    List<PostDto> getAllPosts(); ////Read All The Data From DataBase
}
