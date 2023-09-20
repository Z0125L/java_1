package com.zl;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如下：
        // 5-10月为旺季，头等舱9折，经济舱8.5折； 11月到来年4月为淡季，头等舱7折，经济舱6.5折，
        // 请开发程序计算出用户当前机票的优惠价。
        while (true){
            System.out.println("请输入价格，季节，舱位类型");
            Scanner sc = new Scanner(System.in);
            double priced = sc.nextDouble();
            int month = sc.nextInt();
            String type = sc.next();
            double price = calculate(priced, month, type);
            System.out.println(price);
        }
    }

    public static double calculate(double price, int month, String type) {
        //1.判断当前月份是旺季还是淡季
        if (month >= 5 && month <= 10) {
            //2.判断是头等舱还是经济舱
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
