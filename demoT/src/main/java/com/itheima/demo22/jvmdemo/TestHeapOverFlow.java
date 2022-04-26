package com.itheima.demo22.jvmdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 用来测试堆内存溢出
java.lang.OutOfMemoryError: Java heap space
 */
public class TestHeapOverFlow {
    public static void main(String[] args) {


        int i = 0;
        try {
            List<String> list = new ArrayList<String>();
            String a = "hello";
            while (true) {
                list.add(a);
                a=a+a;
                i++;

            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("循环次数：" + i);
        }
    }
}
