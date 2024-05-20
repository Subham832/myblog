package com.myblog.myblog.service;

import com.myblog.myblog.payload.CommentDto;

public interface CommentService {

   CommentDto createComment(CommentDto commentDto,long postId);
}
