package com.blog1.controller;

import com.blog1.payload.PostDto;
import com.blog1.service.PostService;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/arwa")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
@PostMapping
    public ResponseEntity<?> createPost(@Valid @RequestBody PostDto postDto, BindingResult bindingResult){
if (bindingResult.hasErrors()){
    return new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
}

    PostDto dto = postService.createPost(postDto);

    return new ResponseEntity<>(dto, HttpStatus.CREATED);
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deletePost(@PathVariable long id){
        postService.deletePost(id);

    return new ResponseEntity<>("Post id Deleted!!",HttpStatus.OK);
}

@PutMapping("/{id}")
public ResponseEntity<PostDto> updatePost(@PathVariable long id, @RequestBody PostDto postDto){

    PostDto dtos = postService.updatePost(id, postDto);

    return   new ResponseEntity<>(dtos, HttpStatus.OK);
}




}
