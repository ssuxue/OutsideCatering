package com.chase.feign;

import com.chase.pojo.Type;
import com.chase.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chase
 */
@FeignClient(value = "user")
public interface UserFeign {
    @GetMapping("/user/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @GetMapping("/user/count")
    public int count();

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

    @GetMapping("/user/findTypes")
    public List<Type> findTypes();

    @PostMapping("/user/save")
    public void save(User user);

    @GetMapping("/user/findById/{id}")
    public User findById(@PathVariable("id") long id);

    @PutMapping("/user/update")
    public void update(User user);
}
