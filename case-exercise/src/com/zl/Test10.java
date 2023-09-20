package com.zl;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //完成双色球系统的开发
        int[] UserNumber = userSelectNumbers();
        System.out.println("您投注的号码：");
        PrintArray(UserNumber);
        int[] luckyNumber = createLuckNumbers();
        System.out.println("中奖的号码：");
        PrintArray(luckyNumber);

        judge(UserNumber,luckyNumber);
    }

    private static void PrintArray(int[] userNumber) {
        System.out.print("[");
        for (int i = 0; i < userNumber.length; i++) {
            System.out.print(i == userNumber.length - 1 ? userNumber[i] : userNumber[i] + ",");
        }
        System.out.println("]");
    }

    /**
     * 1、设计一个方法，用于让用户投注一组号码并返回（前6个是红球号码，最后1个是蓝球号码 ）
     */
    public static int[] userSelectNumbers() {
        // 2、创建一个整型数组，用于存储用户投注的7个号码（前6个是红球号码，最后1个是蓝球号码 ）
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        // 3、遍历前6个位置，让用户依次投注6个红球号码，存入
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请你输入第" + (i + 1) + "个红球号码(1-33之间，不能重复):");
                int number = sc.nextInt();
                // 4、开始让用户为当前位置投注一个红球号码（1-33之间，不能重复）
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认！");
                } else {
                    // 号码是在1-33之间了，接着还要继续判断这个号码是否重复，不重复才可以使用。
                    if (exit(numbers, number)) {
                        System.out.println("对不起，您当前输入的红球号码前面选择过，重复了，请确认！");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        // 6、投注最后一个蓝球号码。
        while (true) {
            System.out.println("请您输入最后1个蓝球号码（1-16）：");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的蓝球号码范围不对！");
            } else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    private static boolean exit(int[] numbers, int number) {
        // 需求：判断number这个数字是否在numbers数组中存在。
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2、设计一个方法：随机一组中奖号码出来（6个红球号码，1个蓝球号码 ）
     */
    public static int[] createLuckNumbers() {
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                int number = r.nextInt(33) + 1;
                if (!(exit(numbers, number))) {
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(33) + 1;
        return numbers;
    }

    /**
     * 3、设计一个方法，用于判断用户的中奖情况
     */

    public static void judge(int[] UserNumber, int[] luckyNumber) {
        //分别定义2个变量用于记住红球命中了几个以及蓝球命中了几个
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < UserNumber.length - 1; i++) {

            for (int j = 0; j < luckyNumber.length - 1; j++) {
                if (UserNumber[i] == luckyNumber[j]) {
                    redCount++;
                    break;
                }
            }
        }
        // 3、判断蓝球是否命中了
        blueCount = UserNumber[6] == luckyNumber[6] ? 1 : 0;
        // 4、判断中奖详情，并输出结果
        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜您，中奖1000万，可以开始享受人生了~~~");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜您，中奖500万，可以稍微开始享受人生了~~~");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜您，中奖3000元，可以出去吃顿小龙虾了~");
        }else if(redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("恭喜您，中了小奖：200元~");
        }else if(redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("中了10元~");
        }else if( redCount < 3 && blueCount == 1){
            System.out.println("中了5元~");
        }else {
            System.out.println("感谢您对福利事业做出的巨大贡献~~~");
        }
    }
}
