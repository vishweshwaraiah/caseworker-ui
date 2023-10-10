package com.master.cw_backend.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 10, message = "Post title must be at least 10 chars long!")
    private String postTitle;

    @NotEmpty
    @Size(min = 25, message = "Post content must be at least 25 chars long!")
    private String postContent;

    private String postImage;

    private Date postCreatedOn;

    private Date postUpdatedOn;

    private CategoryDto category;

    private UserDto user;
}
