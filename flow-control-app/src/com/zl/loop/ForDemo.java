package com.zl.loop;

public class ForDemo {
    public static void main(String[] args) {
        //for循环语句
        /*for (int i =0;i<5;i++)
        {
            System.out.println("司文豪傻逼");
        }*/

        /*int sum =0;
        for (int i = 1; i <= 5 ; i++)
        {
            sum+=i;
        }
        System.out.println(sum);*/
        int sum =0;
        for (int i = 1; i <= 100 ; i+=2)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
