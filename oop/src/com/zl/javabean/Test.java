package com.zl.javabean;

public class Test {
    public static void main(String[] args) {
        //掌握实体类的书写要求，特点，应用场景
        //这个类中的成员变量都要私有，并且要对外提供相应的getXxx ，setXxx方法
        //类中必须要有一个公共的无参的构造器。
        Student s1 = new Student();
        s1.setName("司文豪");
        s1.setScore(59);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        studentOperate operate = new studentOperate(s1);
        operate.printPass();
    }
}
