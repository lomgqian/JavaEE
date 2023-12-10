package com.example.homework11.test5;

/**
 * @date 2023/12/9 20:41
 */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectApple {
    @Before("@annotation(LogAppleAction)")
    public void beforeAdvice() {
        System.out.println("---------------------");
        System.out.println("买苹果。");
        System.out.println("清洗苹果。");
    }
}
