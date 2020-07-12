package com.chase.repository;

import com.chase.pojo.User;

import java.util.List;

public interface UserRepository {
    public User findById(long id);
}
