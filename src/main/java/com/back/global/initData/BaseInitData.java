package com.back.global.initData;

import com.back.domain.post.entity.Post;
import com.back.domain.post.repository.PostRepository;
import com.back.domain.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class BaseInitData {

    @Autowired //객체 넣
    private PostRepository postRepository;

    @Autowired
    private PostService postService;

    @Bean
    ApplicationRunner initDataRunner(){
        return args -> {

            work1();
            work2();

        };
    }

    void work1() {

        if(postService.getTotalCount() > 0) {
            return;
        }

        // 서비스를 도입해서 비즈니스 로직을 재사용
        postService.write("제목1", "내용1");
        postService.write("제목2", "내용2");
    }

    void work2() {
        Optional<Post> opPost = postService.getPost(1);
    }
}
