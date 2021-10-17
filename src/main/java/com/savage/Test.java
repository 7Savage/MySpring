package com.savage;


import com.savage.service.UserService;
import com.savage.service.UserServiceImpl;
import com.savage.spring.MyApplicationContext;


public class Test {
    public static void main(String[] args) {
        MyApplicationContext myApplicationContext = new MyApplicationContext(AppConfig.class);
        UserService userService = (UserService) myApplicationContext.getBean("userService");
        userService.test();
    }
}
