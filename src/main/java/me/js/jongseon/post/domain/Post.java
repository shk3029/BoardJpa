package me.js.jongseon.post.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String content;
    private String title;

    private LocalDateTime modDts;
    private LocalDateTime regDts;

}
