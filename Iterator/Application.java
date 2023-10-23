package com.Homework.Iterator;
import java. util. *;
import java.io. *;
/**
 * @date 2023/10/23 10:09
 */
public class Application {
    public static void main(String args[]) {
        BookNameList oldBookList = new BookNameList();
        oldBookList.setBookName();
        Enumeration bookenum = oldBookList.getEnumeration();
        IteratorAdapter adapter = new IteratorAdapter(bookenum);
        NewBookNameList newBookNameList=new NewBookNameList(adapter);
        newBookNameList.setBookName();
        System.out.println("导人到新系统中的图书列表；");
                newBookNameList.getBookName();
    }
}

