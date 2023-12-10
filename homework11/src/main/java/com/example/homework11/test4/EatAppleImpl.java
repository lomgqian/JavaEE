package com.example.homework11.test4;

/**
 * @date 2023/12/9 20:32
 */
import org.springframework.stereotype.Component;

@Component
public class EatAppleImpl implements EatApple {
    @Override
    public void eatAppleRaw() {
        System.out.println("生吃苹果");
    }

    @Override
    public void eatAppleCooked() {
        System.out.println("蒸熟了吃苹果");
    }
}