package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPSpringExample {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EatApple appleEater = context.getBean(EatApple.class);

        appleEater.eatAppleRaw();
        System.out.println("------");
        appleEater.eatAppleCooked();
    }
}
