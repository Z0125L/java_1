package com.zl.define;

import java.util.Random;
import java.util.Scanner;

//随机排名顺序
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第"+(i+1)+"个工号:");
            codes[i] = sc.nextInt();
        }
        Random r =new Random();
        for (int i = 0; i < codes.length; i++) {
           int k = r.nextInt(codes.length);
            int temp = codes[i];
            codes[i] = codes[k];
            codes[k] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
