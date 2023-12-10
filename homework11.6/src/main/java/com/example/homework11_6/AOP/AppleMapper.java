package com.example.homework11_6.AOP;

import org.apache.ibatis.annotations.Mapper;

/**
 * @date 2023/12/9 20:54
 */
@Mapper
public interface AppleMapper {
    void insertApple(Apple apple);
}
