package com.zl.constructor;

public class Student {
    //无参数构造器
    public Student(){
        System.out.println("无参数构造器被执行了");
    }
    //有参数构造器
    public Student(String name,double score){
        System.out.println("有参数构造器被执行了");
    }
}
