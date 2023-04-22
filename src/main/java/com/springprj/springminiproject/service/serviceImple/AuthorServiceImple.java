package com.springprj.springminiproject.service.serviceImple;

import com.springprj.springminiproject.model.Author;
import com.springprj.springminiproject.repository.AuthorRepository;
import com.springprj.springminiproject.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImple implements AuthorService {

    AuthorRepository authorRepository;
    AuthorServiceImple()
    {
        authorRepository = new AuthorRepository();
    }
    @Override
    public List<Author> getAllAuthors()
    {
        return authorRepository.getAllAuthor();
    }
}
