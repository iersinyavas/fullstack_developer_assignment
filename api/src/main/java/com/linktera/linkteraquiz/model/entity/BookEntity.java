package com.linktera.linkteraquiz.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "book")
public class BookEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "isRent")
    private boolean isRent;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "author_id", updatable = false)
    public AuthorEntity author;



}
