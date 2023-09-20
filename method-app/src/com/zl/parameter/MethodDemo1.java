package com.zl.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        charge(a);
        System.out.println("main:"+a);
    }
    public static void charge(int a){
        System.out.println("charge1:"+a);
        a=20;
        System.out.println("charge2:"+a);
    }
}
