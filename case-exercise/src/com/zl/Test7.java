package com.zl;

public class Test7 {
    public static void main(String[] args) {
        //找素数
        //除了1和它本身以外，不能被其他正整数整除，就叫素数。
        //比如：3、7就是素数，而9、21等等不是素数。
        System.out.println("素数的个数："+Prime(101, 200));
    }

    public static int Prime(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
