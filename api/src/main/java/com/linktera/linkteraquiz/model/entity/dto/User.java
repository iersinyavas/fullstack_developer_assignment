package com.linktera.linkteraquiz.model.entity.dto;

import com.linktera.linkteraquiz.model.entity.BookEntity;
import lombok.Data;
import java.util.List;

@Data
public class User {
    private Long userId;
    private String username;
    private String password;
    private List<BookEntity> books;
}
