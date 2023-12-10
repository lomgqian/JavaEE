package com.example.homework11_6.AOP;

/**
 * @date 2023/12/9 21:00
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@Aspect
@Component
public class LoggingAspect {

    @Before("@annotation(com.example.homework11_6.AOP.LogToTextFile)")
    public void logToTextFile(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {
            for (Object arg : args) {
                if (arg instanceof Apple) {
                    logAppleInfo((Apple) arg);
                }
            }
        }
    }

    private void logAppleInfo(Apple apple) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("apple_log.txt", true))) {
            writer.println("苹果信息录入在 " + new Date());
            writer.println("苹果名称: " + apple.getUname());
            writer.println("苹果价格: " + apple.getUprice());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

