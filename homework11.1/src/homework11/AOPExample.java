package homework11;
import java.lang.reflect.Proxy;

public class AOPExample {
    public static void main(String[] args) {
        // 创建实际对象
        EatApple realSubject = new AppleEater();

        // 创建切面对象
        MyAspectApple aspectApple = new MyAspectApple();

        // 创建动态代理
        EatApple proxy = (EatApple) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new MyInvocationHandler(realSubject, aspectApple)
        );

        // 调用代理对象的方法
        proxy.eatAppleRaw();
        System.out.println("------");
        proxy.eatAppleCooked();
    }
}
