package com.linktera.linkteraquiz.model.entity.dto;

import com.linktera.linkteraquiz.model.entity.BookEntity;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Author {
    private Long authorId;
    private String name;
    private List<BookEntity> books = new ArrayList<>();
}
