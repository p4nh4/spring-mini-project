package com.springprj.springminiproject.repository;

import com.springprj.springminiproject.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository
{
    List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"kai","male", "nothing last forever"));
        add(new Author(1002,"cai","male", "nothing last forever"));
        add(new Author(1003,"sai","male", "nothing last forever"));
        add(new Author(1004,"hai","female", "nothing last forever"));

    }} ;
    public List<Author> getAllAuthor(){
        return authors;
    }
}
