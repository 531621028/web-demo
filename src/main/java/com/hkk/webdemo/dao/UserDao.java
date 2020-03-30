package com.hkk.webdemo.dao;

import com.hkk.webdemo.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(String userName, int phone, String email) {
        String sql = "INSERT into user(`user_name`,`phone`,`email`) values (?,?,?)";
        return jdbcTemplate.update(sql, userName, phone, email);
    }

    public UserEntity findById(Long id) {
        String sql = "SELECT * from user where id = ? ";
        List<Object> params = new ArrayList<>();
        params.add(id);
        return jdbcTemplate.queryForObject(sql, params.toArray(), (rs, rowNum) -> {
            UserEntity entity = new UserEntity();
            entity.setId(rs.getLong("id"));
            entity.setUserName(rs.getString("user_name"));
            entity.setPassword(rs.getString("phone"));
            return entity;
        });
    }

}
