package com.imooc.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import com.imooc.dto.UserQueryCondition;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-11-29 9:54 PM
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/me")
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition condition){
        System.out.println(condition.getAge() + condition.getAgeTo());
        List<User> users = new ArrayList<User>();
        users.add(new User("1","12"));
        return users;
    }
    @GetMapping("/{id}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable String id){
        System.out.println(id);
        List<User> users = new ArrayList<User>();
        User user = new User("1","12");
        users.add(user);
        return user;
    }

    @PostMapping("/register")
    public void register() {

    }
}
