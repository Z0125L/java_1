package com.zl;

public class Test8 {
    public static void main(String[] args) {
            //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"X"+j+"="+(i*j)+"\t");
            }

            System.out.print("\n");
        }
    }
}
