package com.itheima.demo22.jvmdemo;


import java.io.*;

//通过读取linux.words  来查看性能问题
public class StringTableDemo {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("linux.words"), "utf-8"));
            String line = null;

            long start = System.nanoTime();
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                //在jdk1.7起将地址复制到stringtable 里面
                line.intern();
            }
            long end = System.nanoTime();
            System.out.println("耗时：" + (end - start) / 1000000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
