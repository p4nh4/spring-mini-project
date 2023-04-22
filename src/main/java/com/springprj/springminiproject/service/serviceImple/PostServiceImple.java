package com.springprj.springminiproject.service.serviceImple;

import com.springprj.springminiproject.model.Post;
import com.springprj.springminiproject.repository.PostRepository;
import com.springprj.springminiproject.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImple implements PostService {
    PostRepository postRepository;
    PostServiceImple()
    {
        postRepository = new PostRepository();
    }
    @Override
    public List<Post> getAllPost() {
        return postRepository.getAllPost();
    }

    @Override
    public Post getPostByID(int id) {
        return null;
    }

    @Override
    public void addNewArticle(Post post) {

    }
}
