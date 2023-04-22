package com.springprj.springminiproject.controller;

import com.springprj.springminiproject.service.AuthorService;
import com.springprj.springminiproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    PostService postService;
    AuthorService authorService;
    @Autowired
    HomeController(PostService postService, AuthorService authorService)
    {
        this.postService = postService;
        this.authorService = authorService;
    }

    @GetMapping("/home")
    public String home()

    {
        return "home";
    }
    @GetMapping("/all-post")
    public String getPost(Model model)
    {
        model.addAttribute("posts", postService.getAllPost());
        return"all-post";
    }
    @GetMapping("/all-author")
    public String getAuthor(Model model)
    {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "all-author";
    }
    @GetMapping("/author")
    public String profile()
    {
        return "author";
    }



}
