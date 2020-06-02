package com.lpc.learn.rpc.controller;

import com.lpc.learn.rpc.rpc.UserRpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/5/28
 * @Time: 10:30
 * @Description:
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Resource
    private UserRpc userRpc;

    @GetMapping(path = "/deal")
    public String deal(String input) {
        return userRpc.deal(input);
    }

    @GetMapping(path = "/dealBatch")
    public String dealBatch(String input) {
        return userRpc.dealBatch(input);
    }
}
