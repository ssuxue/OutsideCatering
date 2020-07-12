package com.chase.controller;

import com.chase.entity.Admin;
import com.chase.entity.User;
import com.chase.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

@Controller
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private AccountFeign accountFeign;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session) {
        Object object = accountFeign.login(username, password, type);
        LinkedHashMap<String, Object> hashMap = (LinkedHashMap<String, Object>) object;
        String result = null;
        if (object == null) {
            result = "login";
        } else {
            switch (type) {
                case "user":
                    User user = new User();
                    user.setId(Long.parseLong(String.valueOf(hashMap.get("id"))));
                    user.setNickname((String) hashMap.get("nickname"));
                    session.setAttribute("user", user);
                    result = "index";
                    break;
                case "admin":
                    Admin admin = new Admin();
                    admin.setId(Long.parseLong(String.valueOf(hashMap.get("id"))));
                    admin.setUsername((String) hashMap.get("username"));
                    session.setAttribute("admin", admin);
                    result = "main";
                    break;
            }
        }
        return result;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login.html";
    }

}
