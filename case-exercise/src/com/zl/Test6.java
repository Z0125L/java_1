package com.zl;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //一个大V直播时发起了抢红包活动，分别有：9、666、188、520、99999五个红包。
        // 请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，
        // 注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）：
        int[] arr = {9, 666, 188, 520, 99999};
        RedWars(arr);
    }

    public static void RedWars(int[] arr) {
        Random r = new Random();
        int index = r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入任意内容开始抽奖:");
            sc.next();
            System.out.println("恭喜你抽中" + arr[i] + "大奖");
        }
        System.out.println("抽奖结束。。");
    }
}
