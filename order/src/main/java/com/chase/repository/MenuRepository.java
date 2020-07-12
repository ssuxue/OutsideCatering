package com.chase.repository;

import com.chase.entity.Menu;

import java.util.List;

/**
 * @author chase
 */
public interface MenuRepository {
    /**
     * @param index 起始下标
     * @param limit 长度
     * @return 数据集合
     */
    public List<Menu> findAll(int index, int limit);

    /**
     * @return 数据总记录数
     */
    public int count();

    /**
     * @param id 查询的ID
     * @return 返回一条记录
     */
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
