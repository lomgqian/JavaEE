package org.example;

import java.lang.reflect.Method;

public class MyAnnotationProcessor {
    public static void processAnnotations(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                String annotationValue = annotation.value();
                System.out.println("Method: " + method.getName() + ", Annotation Value: " + annotationValue);
            }
        }
    }
}
