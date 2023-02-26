package com.likes.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "likes")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer comment = 0;
}
