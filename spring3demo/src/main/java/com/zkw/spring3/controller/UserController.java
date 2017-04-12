package com.zkw.spring3.controller;

import com.zkw.spring3.service.UserServiceI;
import com.zkw.spring3.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.nio.channels.AsynchronousSocketChannel;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
@Controller
public class UserController {

    @Resource
    UserServiceI userService;

    @RequestMapping(value="/add")
    @ResponseBody
    public void addUser(){
        userService.addUser();
        AsynchronousSocketChannel asynchronousSocketChannel;
    }
}
