package com.ravi.booking.controller;

import com.ravi.booking.dao.UserDao;
import com.ravi.booking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    public String hello() {

        List<User> list = userDao.getByAge(23);
        return list.toString();
    }

}
