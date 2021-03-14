package com.linktera.linkteraquiz.service.impl;

import com.linktera.linkteraquiz.model.entity.UserEntity;
import com.linktera.linkteraquiz.repository.UserRepository;
import com.linktera.linkteraquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getList() {
        return null;
    }

    @Override
    public UserEntity get(Long id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public UserEntity save(UserEntity dto) {
        return null;
    }

    @Override
    public void update(UserEntity dto) {

    }

    @Override
    public void delete(Long id) {

    }
}
