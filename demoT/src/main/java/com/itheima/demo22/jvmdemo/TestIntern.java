package com.itheima.demo22.jvmdemo;

public class TestIntern {
    public static void main(String[] args) {

        String s1 = new String("a") + new String("b");

        String s2=s1.intern();

        String s3="ab";
        System.out.println(s3==s2);



    }
}
