package dynamic;

//DynamicTriangleProxy.java
import java.lang.reflect.Proxy;

public class DynamicTriangleProxy {
 public static DynamicGeometry createProxy() {
     DynamicProxyHandler handler = new DynamicProxyHandler();
     return (DynamicGeometry) Proxy.newProxyInstance(
             DynamicTriangleProxy.class.getClassLoader(),
             new Class[]{DynamicGeometry.class},
             handler
     );
 }
}
