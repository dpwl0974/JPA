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
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String title; // final -> 변수의 상수화 -> 명시적으로 값 넣어야 ⭕️

    @Column(columnDefinition = "TEXT")
    private String content;

    // 매개변수 ❌-> 기본 생성자
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
