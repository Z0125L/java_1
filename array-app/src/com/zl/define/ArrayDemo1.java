package com.zl.define;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //动态初始化数组
        //数据类型[] 数组名 = new 数据类型[长度]
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            age[i] = i;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(age[i]);
        }
        System.out.println("-----------------------------");
        double[] score = new double[6];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的分数:");
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        System.out.println("该选手的平均分为:"+sum/ score.length);
    }
}
