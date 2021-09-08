package com.note.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");

        //jdk 1.5以前的写法
        for (Iterator it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

        //jdk 1.5以后的写法
        for (Object l : list){
            System.out.println(l);
        }



    }
}
