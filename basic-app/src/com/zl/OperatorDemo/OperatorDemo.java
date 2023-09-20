package com.zl.OperatorDemo;

public class OperatorDemo {
    public static void main(String[] args) {
        //掌握使用+符号做连接符的情况。
        int a=5;
        System.out.println("abc" + a);
        System.out.println(a + 5);
        System.out.println("itheima" + a + 'a');
        System.out.println(a + 'a' + "itheima");


        //掌握自增自减运算符的是用

        int b=10;
        System.out.println(++b);
        System.out.println(b++);
        System.out.println("----------------------------------------");

        int m = 5;
        int n = 3;
        System.out.println(++m - --m + m-- - ++n + n-- + 3);
        System.out.println("-------------------------------------");

        int c = 10;
        int d = 5;
        int r = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(r);
        System.out.println(c);
        System.out.println(d);

        //扩展运算符
        int i = 1;

        System.out.println(i+=1);
    }
}
