package com.blog1.repository;

import com.blog1.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPostId(postId);
}
