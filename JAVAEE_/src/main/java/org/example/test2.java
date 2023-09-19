package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class test2 {

    private Class<?> clazz;

    public void setClass(Class<?> clazz) {
        this.clazz = clazz;
    }

    public void printConstructors() {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        System.out.println("全部构造器如下：");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<?>[] publicConstructors = clazz.getConstructors();
        System.out.println("全部public构造器如下：");
        for (Constructor<?> constructor : publicConstructors) {
            System.out.println(constructor);
        }
    }

    public void printMethods() {
        Method[] methods = clazz.getMethods();
        System.out.println("全部public方法如下：");
        for (Method method : methods) {
            System.out.println(method);
        }

        try {
            Method specificMethod = clazz.getMethod("display2", String.class, int.class);
            System.out.println("Student里带一个字符串参数和一个整形参数的方法为：" + specificMethod);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void printInnerClasses() {
        Class<?>[] innerClasses = clazz.getDeclaredClasses();
        System.out.println("全部内部类如下：");
        for (Class<?> innerClass : innerClasses) {
            System.out.println(innerClass);
        }
    }

    public void printOuterClass() {
        Class<?> enclosingClass = clazz.getDeclaringClass();
        System.out.println("inClazz对应类的外部类为：" + enclosingClass);
    }

    public void printPackage() {
        Package classPackage = clazz.getPackage();
        System.out.println("Student的包为：" + classPackage);
    }

    public void printSuperclass() {
        Class<?> superclass = clazz.getSuperclass();
        System.out.println("Student的父类为：" + superclass);
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("yjj", 21);
        test2 reflectionDemo = new test2();
        reflectionDemo.setClass(student.getClass());

        reflectionDemo.printConstructors();
        reflectionDemo.printMethods();
        reflectionDemo.printInnerClasses();
        reflectionDemo.printOuterClass();
        reflectionDemo.printPackage();
        reflectionDemo.printSuperclass();
    }
}

class Student {
    private String name;
    private int age;

    private Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Inner {
    }

    class Inner2 {
    }

    public void display() {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }

    public void display2(String name, int age) {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }
}
