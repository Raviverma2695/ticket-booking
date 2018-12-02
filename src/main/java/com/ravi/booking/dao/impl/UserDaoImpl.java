package com.ravi.booking.dao.impl;

import com.ravi.booking.dao.UserDao;
import com.ravi.booking.dao.repository.UserRepository;
import com.ravi.booking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> getByAge(Integer age) {
        return userRepository.findByAge(age);
    }

    @Override
    @Transactional
    public User save(User user) {
        return (User) userRepository.save(user);
    }
}
