package com.chase.repository;

import com.chase.entity.Menu;

import java.util.List;

/**
 * @author chase
 */
public interface MenuRepository {
    public Menu findById(long id);
}
