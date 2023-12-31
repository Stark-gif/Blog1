package com.blog1.service.impl;

import com.blog1.entity.Post;
import com.blog1.exception.CreateException;
import com.blog1.payload.PostDto;
import com.blog1.repository.PostRepository;
import com.blog1.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    private PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }


    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedpost = postRepo.save(post);

        PostDto dto = new PostDto();
        dto.setId(savedpost.getId());
        dto.setTitle(savedpost.getTitle());
        dto.setDescription(savedpost.getDescription());
        dto.setContent(savedpost.getContent());


        return dto;
    }

    @Override
    public void deletePost(long id) {
postRepo.findById(id).orElseThrow(
        ()-> new CreateException("post not found with given id:"+id)
);

        postRepo.deleteById(id);
    }

    @Override
    public PostDto updatePost(long id, PostDto postDto) {
        Post post = postRepo.findById(id).orElseThrow(
                () -> new CreateException("Post not found with id:" + id)
        );
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost = postRepo.save(post);

        PostDto dtos = mapTODtos(savedPost);
        return dtos;
    }
    PostDto mapTODtos(Post post) {
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

}
