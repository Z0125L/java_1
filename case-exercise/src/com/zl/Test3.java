package com.zl;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //在唱歌比赛中，可能有多名评委要给选手打分，分数是[0 - 100]之间的整数。
        // 选手最后得分为：去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分。
        System.out.println(getAverageScore(5));
    }

    public static double getAverageScore(int n) {
        //定义一个数组记录分数
        int[] scores = new int[n];
        //遍历数组录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("给选手打分:");
            scores[i] = sc.nextInt();
        }
        //计算总分，最大值，最小值
        int sum = 0;
        int max = 0;
        int min = 100;
        for (int i = 0; i < scores.length; i++) {
            //计算总分
            sum += scores[i];
            //计算最大值
            if (scores[i] > max) {
                max = scores[i];
            }
            //计算最小值
            if (scores[i] < min)
                min = scores[i];
        }
        return 1.0*(sum - max - min) / (n - 2);
    }
}
