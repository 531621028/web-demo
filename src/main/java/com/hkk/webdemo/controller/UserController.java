package com.hkk.webdemo.controller;

import com.hkk.webdemo.dto.User;
import com.hkk.webdemo.service.RoleService;
import com.hkk.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/{id}/info")
    public Object userInfo(@PathVariable long id){
        return User.fromUserEntity(userService.getById(id));
    }

    @RequestMapping("/{id}/role")
    public Object userRole(@PathVariable long id){
        return roleService.getById(id);
    }

}
