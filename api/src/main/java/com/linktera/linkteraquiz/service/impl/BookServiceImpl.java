package com.linktera.linkteraquiz.service.impl;

import com.linktera.linkteraquiz.common.GeneralEnum;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import com.linktera.linkteraquiz.repository.BookRepository;
import com.linktera.linkteraquiz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookEntity> getList() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity get(Long bookId) {

        return bookRepository.findByBookId(bookId);
    }

    @Override
    public BookEntity save(BookEntity dto) {

        return bookRepository.save(dto);
    }

    @Override
    public void update(BookEntity bookEntity) {
        if (validate(bookEntity)){
            bookRepository.save(bookEntity);
        }
    }

    @Override
    public void delete(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).get();

        if (validate(bookEntity)){
            bookRepository.delete(bookEntity);
        }
    }

    private boolean validate(BookEntity bookEntity){
        try {
            if (bookEntity.isRent() == GeneralEnum.BookStatus.RENT.value()){
                throw new ValidationException();
            }
            return true;
        }catch (ValidationException ve){

        }
        return false;
    }
}
