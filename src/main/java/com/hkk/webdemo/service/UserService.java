package com.hkk.webdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hkk.webdemo.entity.UserEntity;
import com.hkk.webdemo.mapper.UserEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserEntityMapper, UserEntity> {

}
