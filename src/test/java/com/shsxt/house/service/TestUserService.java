package com.shsxt.house.service;

import com.shsxt.house.StarterApplication;
import com.shsxt.house.query.UserQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StarterApplication.class})
public class TestUserService {
    private Logger log= LoggerFactory.getLogger(TestUserService.class);
    @Resource
    private UserService userService;
    @Before
    public void before(){
        log.info("单元测试开始");
    }
    @Test
    public void test01(){
        log.info("用户记录 {}",userService.queryUserList(new UserQuery()).toString());
    }
    @After
    public void after(){
        log.info("单元测试结束");
    }
}
