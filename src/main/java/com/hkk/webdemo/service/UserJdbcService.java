package com.hkk.webdemo.service;

import com.hkk.webdemo.dao.UserDao;
import com.hkk.webdemo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserJdbcService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public int add(String userName, int phone, String email) {
        return userDao.add(userName, phone, email);
    }

    public UserEntity findById(Long id) {
        return userDao.findById(id);
    }

}
