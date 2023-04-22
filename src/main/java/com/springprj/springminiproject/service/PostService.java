package com.springprj.springminiproject.service;

import com.springprj.springminiproject.model.Post;

import java.util.List;

public interface PostService
{
    List<Post> getAllPost();
    Post getPostByID(int id );

    void addNewArticle(Post post);
}
