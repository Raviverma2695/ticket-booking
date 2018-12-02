package com.ravi.booking.dao;

import com.ravi.booking.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getByAge(Integer age);

    public User save(User user);

}
