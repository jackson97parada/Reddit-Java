package com.categories.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "sub_categories")
@Data
@AllArgsConstructor @NoArgsConstructor
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;

    private Boolean enable;
}
