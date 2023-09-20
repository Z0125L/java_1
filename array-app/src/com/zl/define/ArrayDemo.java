package com.zl.define;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组
        //1.完整写法
        // 数据类型[] 数组名 = new 数据类型[]{元素1，元素2，.....}
        //2.简化写法
        //数据类型[] 数组名 = {元素1，元素2，.....}
        //3.也可以写成
        //数据类型 数组名[]= {元素1，元素2，.....}
        int ages[] = {1, 2, 3, 4, 5};

        //System.out.println(ages[2]);
        //System.out.println(ages.length);
        for (int i = 0; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }

        System.out.println("-----------------------------");
        int money[]={16,26,36,6,100};
        int sum =0;
        for (int i = 0; i < money.length; i++)
        {

            sum +=money[i];
        }
        System.out.println(sum);
    }
}
