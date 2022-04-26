package com.itheima.demo22.overflowdemo;


//有时候不是自己写的方法出现内存溢出,可能是第三方引起的

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;

//通过对象转json来展示
public class TestStackOverFlowOfOther {

    public static void main(String[] args) throws IOException {

        //这种双向数据绑定会使得第三方出现内存溢出
        //加入@JsonIgnore 注解去掉

        Dept dept = new Dept();
        dept.setName("市场部");

        Emp epm1 = new Emp(1, "李四", 20);

        Emp epm2 = new Emp(2, "小明", 22);

        epm1.setDept(dept);
        epm2.setDept(dept);


        dept.setList(Arrays.asList(epm1, epm2));
        ObjectMapper om = new ObjectMapper();

        System.out.println(om.writeValueAsString(dept));


    }


}


