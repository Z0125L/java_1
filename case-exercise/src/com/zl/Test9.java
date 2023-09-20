package com.zl;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //打印三角形
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入行数：");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(j % 2 == 0 ? " " : "*");
                }
                System.out.println();
            }
        }
    }
}
