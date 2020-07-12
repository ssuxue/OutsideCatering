package com.chase.repository;

import com.chase.entity.Type;

import java.util.List;

/**
 * @author chase
 */
public interface TypeRepository {
    public Type findById(long id);
}
