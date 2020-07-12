package com.chase.repository;

import com.chase.entity.User;

/**
 * @author chase
 */
public interface UserRepository {
    public User login(String username, String password);
}
