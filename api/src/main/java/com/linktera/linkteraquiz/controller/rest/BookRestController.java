package com.linktera.linkteraquiz.controller.rest;

import com.linktera.linkteraquiz.common.UtilityService;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import com.linktera.linkteraquiz.model.entity.UserEntity;
import com.linktera.linkteraquiz.model.entity.dto.Book;
import com.linktera.linkteraquiz.model.entity.dto.User;
import com.linktera.linkteraquiz.request.BookRequest;
import com.linktera.linkteraquiz.response.BookResponse;
import com.linktera.linkteraquiz.service.BookService;
import com.linktera.linkteraquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Autowired
    private UtilityService utilityService;

    @PostMapping("/save")
    public ResponseEntity saveBook(@RequestBody BookRequest request) {
        if (request == null || request.getBookEntity() == null) {
            throw new NullPointerException("Book not be empty");
        }

        BookEntity bookEntity = bookService.save(request.getBookEntity());
        return new ResponseEntity<BookEntity>(bookEntity, HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<BookResponse> getBook(@PathVariable("bookId") Long bookId){
        BookResponse bookResponse = new BookResponse();
        Book book = utilityService.convert(bookService.get(bookId), new Book());
        //book.setAuthor(book.get);
        bookResponse.setBook(book);

        return new ResponseEntity<BookResponse>(bookResponse, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Book>> getBooks(@PathVariable("userId") Long userId){
        UserEntity userEntity = userService.get(userId);
        List<BookEntity> bookEntities = userEntity.getBooks();
        List<Book> books = utilityService.convertBooks(bookEntities, new ArrayList<>());
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }
}
