package com.itheima.demo22;


//递归测试占内存溢出
//edit修改 -Xss128k   测试一下。 VM option
//
public class TestStackOverFlow {

    public static  int count;

    public static void main(String[] args) {

        try{
        methodRecursion();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("递归次数："+count);
        }
    }

    private static void methodRecursion() {
        count++;
        methodRecursion();

    }
}
