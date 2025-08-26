package com.back.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String title; // final -> 변수의 상수화 -> 명시적으로 값 넣어야 ⭕️

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate // 알아서 기계가
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifyDate;

    // 매개변수 ❌-> 기본 생성자
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
