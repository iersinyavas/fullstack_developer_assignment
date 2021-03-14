package com.linktera.linkteraquiz.repository;

import com.linktera.linkteraquiz.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    @Query("select b from BookEntity b where b.bookId = :bookId")
    BookEntity findByBookId(@Param("bookId") Long bookId);
}
