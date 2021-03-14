package com.linktera.linkteraquiz.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import lombok.Getter;

@Getter
public class BookRequest {

    @JsonProperty("book")
    private BookEntity bookEntity;

}
