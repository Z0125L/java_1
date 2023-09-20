package com.zl.define;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println(add(100));
        System.out.println("--------------------------------------");
        jude(11);
    }
    public static void jude(int number)
    {
        if(number % 2 == 0)
        {
            System.out.println(number+"为偶数");
        }
        else {
            System.out.println(number+"为奇数");
        }
    }

    public static int add(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
