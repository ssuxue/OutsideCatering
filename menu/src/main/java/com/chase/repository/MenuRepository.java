package com.chase.repository;

import com.chase.pojo.Menu;

import java.util.List;

/**
 * @author chase
 */
public interface MenuRepository {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
}
