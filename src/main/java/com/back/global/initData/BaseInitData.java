package com.back.global.initData;

import com.back.domain.post.entity.Post;
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
    ApplicationRunner initDataRunner(){
        return args -> {

            postRepository.count();
            postRepository.findById(1);

            Post post1 = new Post("제목 1", "내용 1");
            postRepository.save(post1);
        };
    }
}
