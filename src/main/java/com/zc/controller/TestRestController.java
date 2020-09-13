package com.zc.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


import com.zc.dao.UserRepository;
import com.zc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 *   @创建人  zc
 *   @创建时间 2020/9/12 20:15
 *   @包名: com.zc.controller
 *   @描述：
 */

@RestController
public class TestRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Resource
    private UserRepository userRepository;

    @GetMapping("/searchUser")
    public List<User> greeting() {
        return userRepository.findByName("111");
    }
}
