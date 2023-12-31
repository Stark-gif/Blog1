package com.blog1.service.impl;

import com.blog1.repository.CommentRepository;
import com.blog1.repository.PostRepository;
import com.blog1.service.CommentService;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepo;
    private PostRepository postRepo;

    public CommentServiceImpl(CommentRepository commentRepo, PostRepository postRepo) {
        this.commentRepo = commentRepo;
        this.postRepo = postRepo;
    }





}
