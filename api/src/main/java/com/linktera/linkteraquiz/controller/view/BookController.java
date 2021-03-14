package com.linktera.linkteraquiz.controller.view;

import com.linktera.linkteraquiz.common.UtilityService;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import com.linktera.linkteraquiz.model.entity.dto.Book;
import com.linktera.linkteraquiz.request.BookRequest;
import com.linktera.linkteraquiz.response.BookResponse;
import com.linktera.linkteraquiz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    private UtilityService utilityService;

    @GetMapping()
    public BookResponse getBooks() {
        return new BookResponse(utilityService.convertBooks(bookService.getList(), new ArrayList<>()));
    }

    @GetMapping("/{bookId}")
    public ModelAndView getBook(@PathVariable("bookId") Long bookId) {
        if (bookId == null) {
            throw new NullPointerException("bookId not be empty");
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(modelAndView);
        return modelAndView;
    }

    @PostMapping()
    public void saveBook(@RequestBody BookRequest request) {
        if (request == null || request.getBookEntity() == null) {
            throw new NullPointerException("Book not be empty");
        }

        bookService.save(request.getBookEntity());
    }

    @PutMapping("/{bookId}")
    public void updateBook(@RequestBody BookRequest request, @PathVariable("bookId") Long bookId) {
        if (request == null || request.getBookEntity() == null || bookId == null) {
            throw new NullPointerException("Book or bookId not be empty");
        }

        bookService.update(request.getBookEntity());
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId) {
        if (bookId == null) {
            throw new NullPointerException("bookId not be empty");
        }
        bookService.delete(bookId);
    }

}
