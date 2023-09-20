package com.zl.define;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[6];
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            score[i]=sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("得分最高的为"+max);
    }
}
