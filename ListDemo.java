package com.Jeffrey.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(1,"b");
        System.out.println(list.subList(0,2));
    }
}
