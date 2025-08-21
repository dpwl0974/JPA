package com.back.domain.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@RequiredArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private final String title; // final -> 변수의 상수화 -> 명시적으로 값 넣어야 ⭕️

    @Column(columnDefinition = "TEXT")
    private final String content;

    // 매개변수 ❌-> 기본 생성자
    public Post() {
        this.title = "";
        this.content = "";
    }
}
