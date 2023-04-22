package com.springprj.springminiproject.repository;

import com.springprj.springminiproject.model.Author;
import com.springprj.springminiproject.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    List<Post> postList = new ArrayList<>()
    {
        {
            add(new Post(100, "Productive App","time to be productive my dude","prod.png",new Author()));
            add(new Post(101, "What happening?!?!","an ant can be this toxic???","prod.png",new Author()));
            add(new Post(102, "Golden Hour","everything in one word... YELLOW","prod.png",new Author()));

        }
    };
    public List<Post> getAllPost()
    {

        return postList;
    }

    public Post getPostByID(int id ){
        return postList.stream().filter(e-> e.getId()==id).findFirst()
                .orElse(null);
    }

    public void addNewPost(Post post){
//        articleList.add(article);
    }

}
