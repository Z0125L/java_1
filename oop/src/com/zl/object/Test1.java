package com.zl.object;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "司文豪";
        s1.math = 90;
        s1.chinese = 30;
        s1.printTotalScore();
        Student s2 = new Student();
        System.out.println(s1);
        s2.chinese = 150;
        s2.math = 150;
        s2.name = "zl";
        s2.printTotalScore();
        System.out.println(s2);
    }
}
