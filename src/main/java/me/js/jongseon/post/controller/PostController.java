package me.js.jongseon.post.controller;

import me.js.jongseon.post.domain.Post;
import me.js.jongseon.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public Page<Post> postList(Pageable pageable) {
        return postService.getPostList(pageable);
    }

    @GetMapping("/{id}")
    public void getPostDetail(@PathVariable Long id) {
        postService.getPostDetail(id);
    }

    @PostMapping
    public void savePost(Post post) {
        postService.savePost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
