package com.itheima.demo22.jvmdemo;


//测试字符串常量池 StringTable
//StringTable
public class TesStringTable {
    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;//这个是变量是变化的，所以应该是运行期才能确定。
        String s5 = "a" + "b";//这javac在编译期间优化了，结果已经在变编译期间确定ab了


    }
}
