package com.example.homework11.test5;

/**
 * @date 2023/12/9 20:36
 */
import org.springframework.stereotype.Component;

@Component
public class EatAppleImpl implements EatApple {
    @LogAppleAction
    public void eatAppleRaw() {
        System.out.println("生吃苹果");
    }

    @LogAppleAction
    public void eatAppleCooked() {
        System.out.println("蒸熟了吃苹果");
    }
}