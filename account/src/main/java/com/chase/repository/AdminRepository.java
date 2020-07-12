package com.chase.repository;

import com.chase.pojo.Admin;

/**
 * @author chase
 */
public interface AdminRepository {
    public Admin login(String username, String password);
}
