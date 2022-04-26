package com.itheima.demo22;

import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();


        set.add("java1");
        set.add("java2");
        set.add("java3");
        set.add("java4");
        set.add("java5");
        set.add("java6");

        for (String s : set) {
            System.out.println(s.hashCode()+"___"+s);

        }


    }
}
