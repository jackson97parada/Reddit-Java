package com.posts.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FilePostDTO {
    private Long id;
    private String file;
}
