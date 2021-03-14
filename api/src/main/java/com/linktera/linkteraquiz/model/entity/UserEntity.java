package com.linktera.linkteraquiz.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "passwod")
    private String password;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BookEntity> books;
}
