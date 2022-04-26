package com.itheima.demo;


public class Test06 {
    public static void main(String[] args) {
//String  是不可变。
// StringBuilder 是可变的

        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);
        StringBuilder sb1 = new StringBuilder("hello");
        System.out.println("sb1 = " + sb1);
        System.out.println("======================");

        sb.append("hello").append("world");
        System.out.println(sb);
        //反转
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());

        System.out.println("===========================");

        //相互转化
           /*
             String  s="2334414g"1;
             StringBuilder builder = new StringBuilder(s);
             String s = sb.toString();
             */


       // arrayToStr();
        reverseToStr();
    }

    private static void reverseToStr() {

        String  str="asfbskvbk1";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }

    private static void arrayToStr() {

        int[] arr = {123, 56, 2456, 62, 4};
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);

            } else {
                sb.append(arr[i] + ",");
            }

        }
        sb.append("]");
        System.out.println(sb);


    }


}
