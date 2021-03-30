package com.linktera.linkteraquiz.model.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {
    private Long bookId;
    private String title;
    private boolean isRent;
    private User user;
    public Author author;
}
