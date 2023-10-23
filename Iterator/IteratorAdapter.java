package com.Homework.Iterator;
import java.util.*;
/**
 * @date 2023/10/23 9:52
 */
public class IteratorAdapter implements Iterator{

        Enumeration bookenum;
        IteratorAdapter(Enumeration bookenum){
            this. bookenum = bookenum;
        }
    public boolean hasNext(){
            return bookenum. hasMoreElements();
        }
    public Object next(){
            return bookenum. nextElement();
        }
    public void remove(){
            System. out. println("枚举器没有删除集合元素的方法");
}
}



