package com.linktera.linkteraquiz.common;

import com.linktera.linkteraquiz.model.entity.AuthorEntity;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import com.linktera.linkteraquiz.model.entity.UserEntity;
import com.linktera.linkteraquiz.model.entity.dto.Author;
import com.linktera.linkteraquiz.model.entity.dto.Book;
import com.linktera.linkteraquiz.model.entity.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilityService {

    public Book convert(BookEntity source, Book target){
        target.setBookId(source.getBookId());
        target.setTitle(source.getTitle());
        target.setRent(source.isRent());
        return target;
    }

    public User convert(UserEntity source, User target){
        target.setUserId(source.getUserId());
        target.setUsername(source.getUsername());
        target.setPassword(source.getPassword());
        return target;
    }

    public Author convert(AuthorEntity source, Author target){
        target.setAuthorId(source.getAuthorId());
        target.setName(source.getName());
        target.setBooks(source.getBooks());
        return target;
    }


    public List<Book> convertBooks(List<BookEntity> source, List<Book> target){
        source.forEach(sourceEntity -> {
            target.add(convert(sourceEntity, new Book()));
        });
        return target;
    }

    public List<User> convertUsers(List<UserEntity> source, List<User> target){
        source.forEach(sourceEntity -> {
            target.add(convert(sourceEntity, new User()));
        });
        return target;
    }

    public List<Author> convertAuthors(List<AuthorEntity> source, List<Author> target){
        source.forEach(sourceEntity -> {
            target.add(convert(sourceEntity, new Author()));
        });
        return target;
    }
}
