package com.zkw.spring3.service.impl;

import com.zkw.spring3.dao.TMytestMapper;
import com.zkw.spring3.entity.TMytest;
import com.zkw.spring3.service.UserServiceI;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/16 0016.
 * 使用@Service注解将UserServiceImpl类标注为一个service
 * service的id是userService
 */
@Service
public class UserServiceImpl implements UserServiceI {
    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
    @Resource
    private TMytestMapper userMapper;//注入dao

    public TMytest getUserById(String userId) {
        return userMapper.selectByPrimaryKey("1");
    }

    public void addUser() {
        TMytest tMytest = new TMytest();
        tMytest.setUserName("james");
        tMytest.setUserBirthday(new Date());
        tMytest.setUserSalary(13.2);
        userMapper.insert(tMytest);
    }
}
