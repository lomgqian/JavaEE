package dynamic;

import java.util.Scanner;

public class DynamicApplication {
 public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner reader = new Scanner(System.in);
     System.out.println("请输入三个数,每输入一个数回车确认");
     double a = -1, b = -1, c = -1;
     a = reader.nextDouble();
     b = reader.nextDouble();
     c = reader.nextDouble();

     DynamicGeometry proxy = DynamicTriangleProxy.createProxy();
     proxy.setABC(a, b, c);
     double area = proxy.getArea();

     System.out.println("面积是: " + area);
 }
}
