package com.chase.repository;

import com.chase.entity.Admin;

/**
 * @author chase
 */
public interface AdminRepository {
    public Admin login(String username, String password);
}
