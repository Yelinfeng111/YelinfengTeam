package com.steam.controller;

import com.steam.entity.Users;
import com.steam.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MainController {
    @Resource
    private UsersService usersService;

    @RequestMapping("/abc")
    @ResponseBody
    public String abc(){
        System.out.println(usersService.queryUsers(new Users()).size());
        return null;
    }
}
