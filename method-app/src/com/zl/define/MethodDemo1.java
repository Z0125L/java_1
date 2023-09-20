package com.zl.define;

public class MethodDemo1 {
    public static int sum(int x,int y)
    {
        return x+y;
    }

    public static void main(String[] args) {
        //掌握方法的完整格式，搞清楚使用方法的好处
        //java方法类似C语言的函数，方法是一种语法结构，它可以把一段代码封装成一个功能，以便重复调用

        //写一个方法求和
        System.out.println(sum(5,10));

    }
}
