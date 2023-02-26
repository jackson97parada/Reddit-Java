package com.comments.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
}
