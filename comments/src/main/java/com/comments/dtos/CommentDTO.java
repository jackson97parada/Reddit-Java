package com.comments.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CommentDTO {
    private Long id;
    private String comment;
}
