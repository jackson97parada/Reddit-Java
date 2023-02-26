package com.favorites.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "favorites")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Favorit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
