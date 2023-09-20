package com.zl.loop;

public class WhileDemo {
    public static void main(String[] args) {
        //while循环

        //定义珠穆朗玛峰的高度和纸张的厚度
        double peakHeight =8848860;
        double paperThickness=0.1;
        int count = 0;
        while (paperThickness<peakHeight)
        {
            paperThickness*=2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
