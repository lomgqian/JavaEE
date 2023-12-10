package com.example.homework11_6.AOP;

/**
 * @date 2023/12/9 21:00
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogToTextFile {//定义了一个注解类型，名为 LogToTextFile。
}