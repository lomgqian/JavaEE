package homework11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    private MyAspectApple aspectApple;

    public MyInvocationHandler(Object target, MyAspectApple aspectApple) {
        this.target = target;
        this.aspectApple = aspectApple;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在调用吃苹果函数之前先调用切面类的买苹果和清洗苹果的函数
        aspectApple.buyApple();
        aspectApple.cleanApple();

        // 调用原始方法
        Object result = method.invoke(target, args);

        return result;
    }
}

