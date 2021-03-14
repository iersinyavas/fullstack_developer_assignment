package com.linktera.linkteraquiz.service.base;

import com.linktera.linkteraquiz.common.exception.ValidationException;

import java.util.List;
import java.util.UUID;

public interface BaseService<T> {

    List<T> getList();

    T get(Long id);

    T save(T dto);

    void update(T dto);

    void delete(Long id);

}
