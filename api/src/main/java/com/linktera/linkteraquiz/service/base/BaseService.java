package com.linktera.linkteraquiz.service.base;

import java.util.List;

public interface BaseService<T> {

    List<T> getList();

    T get(Long id);

    T save(T dto);

    void update(T dto);

    void delete(Long id);

}
