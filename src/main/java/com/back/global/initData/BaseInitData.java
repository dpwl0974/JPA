package com.back.global.initData;

import com.back.domain.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {

    @Autowired //객체 넣
    private PostRepository postRepository;

    @Bean
    ApplicationRunner initData(){
        return args -> {

            postRepository.count();

//            Post post1 = new Post();
//            post1.setTitle("첫 게시글 제목");
//            post1.setContent("첫 게시글 내용");
//
//            postRepository.save(post1);
        };
    }
}
