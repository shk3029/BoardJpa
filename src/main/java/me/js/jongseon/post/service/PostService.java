package me.js.jongseon.post.service;

import me.js.jongseon.post.domain.Post;
import me.js.jongseon.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    /**
     * 게시판 목록을 가져옴
     */
    public List<Post> getPostList() {
        return postRepository.findAll();
    }
}
