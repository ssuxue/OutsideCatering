package com.chase.repository;

import com.chase.pojo.User;

/**
 * @author chase
 */
public interface UserRepository {
    public User login(String username, String password);
}
