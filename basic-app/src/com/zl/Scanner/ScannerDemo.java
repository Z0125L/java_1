package com.zl.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("你的年龄是"+age);
        System.out.println("请输入你的姓名");
        String name = sc.next();
        System.out.println("你的姓名是"+name);
        System.out.println(name+"大傻逼");
    }
}

