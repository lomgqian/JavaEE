package test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectApple {
    
    @Before("execution(* eatAppleRaw()) || execution(* eatAppleCooked())")
    public void buyAndCleanApple() {
        System.out.println("买苹果");
        System.out.println("清洗苹果");
    }
}
