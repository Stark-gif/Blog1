package com.blog1.service;

import com.blog1.payload.PostDto;

import java.util.List;

public interface PostService {




    public PostDto createPost(PostDto postDto);

    void deletePost(long id);


    PostDto updatePost(long id, PostDto postDto);
}
