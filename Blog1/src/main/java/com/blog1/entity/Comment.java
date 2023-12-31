package com.blog1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "arwacomments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private long id;
    private String name;
    private String email;
    private String body;




}
