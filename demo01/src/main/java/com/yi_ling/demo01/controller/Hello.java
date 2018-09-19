package com.yi_ling.demo01.controller;

import com.yi_ling.demo01.service.serviceImpl.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    private User user;

    @GetMapping("Hello")
    public String guoJian() {
        String add = user.add();


        return add;
    }


}
