package com.zl.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        //使用方法打印多行helloworld
        printHelloWorld(6);
    }
    public static void printHelloWorld(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }
}
