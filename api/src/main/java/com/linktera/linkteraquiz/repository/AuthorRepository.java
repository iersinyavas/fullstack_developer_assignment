package com.linktera.linkteraquiz.repository;

import com.linktera.linkteraquiz.model.entity.AuthorEntity;
import com.linktera.linkteraquiz.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    @Query("select a from AuthorEntity a where a.authorId = :authorId")
    AuthorEntity findByAuthorId(@Param("authorId") Long authorId);
}
