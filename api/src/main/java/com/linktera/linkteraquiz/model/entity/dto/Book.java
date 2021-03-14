package com.linktera.linkteraquiz.model.entity.dto;

import lombok.Data;

@Data
public class Book {
    private Long bookId;
    private String title;
    private boolean isRent;
    private User user;
    public Author author;
}
