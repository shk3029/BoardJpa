package me.js.jongseon.post.repository;

import me.js.jongseon.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitle(String title);

    /*
        QueryDsl 사용해보자
     */
    
    
}
