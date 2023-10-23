package com.Homework.Iterator;
import java. util. *;
/**
 * @date 2023/10/23 10:01
 */
public class BookNameList {
    private Vector<String> vector;
    private Enumeration bookenum;
    BookNameList(){
        vector = new Vector<String>();
    }
    public void setBookName(){
        vector.add("Java 程序设计");
        vector.add("J2ME 程序设计");
        vector.add("XML程序设计");
        vector.add("JSP 程序设计");
    }
    public Enumeration getEnumeration(){
        return vector.elements();
    }
}

