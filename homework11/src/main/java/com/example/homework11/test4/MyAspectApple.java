package com.example.homework11.test4;

/**
 * @date 2023/12/9 20:32
 */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 定义切面类
@Aspect
@Component
public class MyAspectApple {
    @Before("execution(* EatAppleImpl.*(..))")
    public void beforeAdvice() {
        System.out.println("---------------------");
        System.out.println("买苹果。");
        System.out.println("清洗苹果。");
    }
}