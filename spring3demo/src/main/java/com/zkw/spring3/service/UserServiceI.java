package com.zkw.spring3.service;

import com.zkw.spring3.entity.TMytest;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public interface UserServiceI {
    /**
     * 添加用户
     */
    void addUser();

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    TMytest getUserById(String userId);
}
