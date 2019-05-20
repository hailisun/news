package com.haili.user.service;

import com.haili.Application;
import com.haili.user.model.request.LoginRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        LoginRequest request = new LoginRequest();
        request.setMobile("13297904881");
        request.setPassword("1");
        System.out.println(userService.login(request));
    }
}
