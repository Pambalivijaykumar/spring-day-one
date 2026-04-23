package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdayone.User;

public class SpringContext {

    public static void main(String[] args) {

    	ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

        User user1 = container.getBean("user1", User.class);
        System.out.println(user1);

        User user2 = container.getBean("user2", User.class);
        System.out.println(user2);

        ((AbstractApplicationContext) container).close();
    }
}
