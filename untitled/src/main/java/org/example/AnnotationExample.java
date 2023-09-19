package org.example;

/**
 * @date 2023/9/18 19:37
 */
public class AnnotationExample {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // 使用注解处理程序处理带有注解的方法
        MyAnnotationProcessor.processAnnotations(myObject);

        // 调用带注解的方法
        myObject.myAnnotatedMethod("Custom Value");
    }
}

class MyClass {
    @MyAnnotation("Annotated Value")
    public void myAnnotatedMethod(String value) {
        System.out.println("myAnnotatedMethod is called with value: " + value);
    }
}
