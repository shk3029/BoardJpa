package me.js.jongseon.post.repository;

import com.oracle.tools.packager.Log;
import javafx.geometry.Pos;
import me.js.jongseon.post.domain.Post;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void saveAndListPost() {
        Post post = new Post();
        post.setTitle("test");
        System.out.println(post.getId());
        System.out.println(post.getTitle());
        postRepository.save(post);
        List<Post> postList = postRepository.findAll();
        assertThat(postList.size()).isEqualTo(1);
        assertThat(postList.get(0).getTitle()).isEqualTo("test");
    }


}