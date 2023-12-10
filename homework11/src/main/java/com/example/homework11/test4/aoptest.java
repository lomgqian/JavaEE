package com.example.homework11.test4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @date 2023/12/9 20:33
 */
public class aoptest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EatApple eatApple = context.getBean(EatApple.class);
        eatApple.eatAppleRaw();
        eatApple.eatAppleCooked();
    }
}
