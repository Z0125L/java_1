package com.zl.encapsulation;

public class Test {
    public static void main(String[] args) {
        //掌握封装的设计规范：合理影藏，合理暴露
        //公开成员用public修饰
        //隐藏成员用private修饰
        Student s1 = new Student();
        s1.setScore(90);
        System.out.println(s1.getScore());
        s1.printPass();
    }
}
