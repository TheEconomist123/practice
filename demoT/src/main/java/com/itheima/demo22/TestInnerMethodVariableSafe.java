package com.itheima.demo22;

//测试方法内局部变量是否安全
public class TestInnerMethodVariableSafe {

    public static void main(String[] args) {


        for (int i = 0; i < 2; i++) {

            new Thread(() -> {

                for (int j = 0; j < 100; j++) {

                    System.out.println(Thread.currentThread().getName() + ":" + j);

                }
            }).start();

        }
    }
}
