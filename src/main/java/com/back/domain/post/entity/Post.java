package com.back.domain.post.entity;

import com.back.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
public class Post extends BaseEntity {
    private String title; // final -> 변수의 상수화 -> 명시적으로 값 넣어야 ⭕️

    @Column(columnDefinition = "TEXT")
    private String content;

    // 매개변수 ❌-> 기본 생성자
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
