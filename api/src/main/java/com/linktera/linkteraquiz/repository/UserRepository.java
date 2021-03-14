package com.linktera.linkteraquiz.repository;

import com.linktera.linkteraquiz.model.entity.AuthorEntity;
import com.linktera.linkteraquiz.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select u from UserEntity u where u.userId = :userId")
    UserEntity findByUserId(@Param("userId") Long userId);

}
