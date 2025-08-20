package com.back.domain.post.repository;

import com.back.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// 인터페이스 -> 추상 메서드 집합 (구현 JPA가 해줌)
// Post -> 다룰 데이터 타입
public interface PostRepository extends JpaRepository<Post, Integer> {


}
