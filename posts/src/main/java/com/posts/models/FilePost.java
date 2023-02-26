package com.posts.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "file_posts")
@Data
@AllArgsConstructor @NoArgsConstructor
public class FilePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String file;
}
