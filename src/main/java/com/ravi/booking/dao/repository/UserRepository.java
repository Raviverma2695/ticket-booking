package com.ravi.booking.dao.repository;

import com.ravi.booking.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByAge(Integer age);
}
