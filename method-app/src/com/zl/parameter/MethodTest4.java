package com.zl.parameter;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        //判断两个数组是否一样
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];

        while (true){
            System.out.println("请输入：");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] =sc.nextInt();
            }
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] =sc.nextInt();
            }
            System.out.println(equals(arr1, arr2));
        }
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        //判断两个数组是否为null
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        //判断两个数组长度是否一样
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
            return true;
        }
    }
