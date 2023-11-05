package com.philiphyw.securecapita.repository;

import com.philiphyw.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository <T extends User>{
    T create(T data);
    Collection<T> list(int page, int pageSize);

    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
}
