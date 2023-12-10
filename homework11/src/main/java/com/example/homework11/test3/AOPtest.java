package com.example.homework11.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2023/12/9 20:30
 */
public class AOPtest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        EatApple eatApple = context.getBean(EatApple.class);
        eatApple.eatAppleRaw();
        System.out.println("---------------------");
        eatApple.eatAppleCooked();
    }
}
