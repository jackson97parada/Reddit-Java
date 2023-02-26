package com.posts.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
