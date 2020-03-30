package com.hkk.webdemo.dto;

import com.hkk.webdemo.entity.UserEntity;
import com.hkk.webdemo.utils.BeanUtils;

public class User {

    private long userId;
    //用户名
    private String userName;
    //昵称
    private String nickName;
    //头像
    private String avatar;
    //性别
    private Integer gender;
    //状态
    private Integer status;

    public static User fromEntity(UserEntity userEntity) {
        User user = BeanUtils.copy(userEntity, User.class);
        user.setUserId(userEntity.getId());
        return user;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
