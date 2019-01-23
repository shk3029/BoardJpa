package me.js.jongseon.post.service;

import me.js.jongseon.post.domain.Post;
import me.js.jongseon.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    /**
     * 게시물 조회
     */
    public Page<Post> getPostList(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    /**
     * 게시물 상세
     * @param id
     */
    public void getPostDetail(Long id) {
        Optional<Post> post = postRepository.findById(id);
    }

    /**
     * 게시물 저장
     * @param post
     */
    public void savePost(Post post) {
        postRepository.save(post);
    }

    /**
     * 게시물 삭제
     * @param id
     */
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
