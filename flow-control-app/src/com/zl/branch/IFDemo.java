package com.zl.branch;

public class IFDemo {
    public static void main(String[] args) {
        // if 语句
        //例：测量用户的体温，发现体温高于37度就报警
        double t = 38.3;
        if(t > 37)
        {
            System.out.println("体温异常，发烧");
        }
        else
        {
            System.out.println("体温正常");
        }
        System.out.println("-------------------------------------------------");
        //等级评级
        int score = 88;
        if(score>=0 && score<30)
        {
            System.out.println("C");
        }
        else if(score>=30 && score<60)
        {
            System.out.println("B");
        }
        else if(score>=60 && score <90)
        {
            System.out.println("B+");
        }
        else if(score>=90 && score<=100)
        {
            System.out.println("A");
        }
    }
}
