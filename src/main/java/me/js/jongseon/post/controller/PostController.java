package me.js.jongseon.post.controller;

import me.js.jongseon.post.domain.Post;
import me.js.jongseon.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public String postList() {

        List<Post> postList = postService.getPostList();
        return "hello";
    }

    @GetMapping("/{id}")
    public void getPostDetail(@PathVariable Long id) {

    }

    @PostMapping
    public void savePost() {

    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        return id.toString();
    }





}
