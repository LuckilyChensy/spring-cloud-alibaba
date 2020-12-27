package com.exp.usercenter.controller;

import com.exp.usercenter.dao.user.UserMapper;
import com.exp.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public User testInsert(){
        User user = new User();
        user.setAvatarUrl("XXX");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;
    }
}
