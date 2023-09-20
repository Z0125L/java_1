package com.zl.loop;

public class LoopNestedDemo {
    public static void main(String[] args) {
        //循环嵌套
        int i =0;
        for (i = 0; i <3 ; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
