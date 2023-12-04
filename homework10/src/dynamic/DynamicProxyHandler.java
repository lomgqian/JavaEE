package dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
 private Triangle triangle = new Triangle();

 @Override
 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
     if (method.getName().equals("setABC")) {
         // Intercept setABC method and set values in the real object
         double a = (double) args[0];
         double b = (double) args[1];
         double c = (double) args[2];
         triangle.setABC(a, b, c);
         return null;
     } else if (method.getName().equals("getArea")) {
         // Intercept getArea method and invoke it on the real object
         return triangle.getArea();
     } else {
         // For other methods, you can handle them accordingly
         return null;
     }
 }
}
