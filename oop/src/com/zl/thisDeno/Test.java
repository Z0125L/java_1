package com.zl.thisDeno;

public class Test {
    public static void main(String[] args) {
        //认识this，掌握this的应用场景
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        System.out.println("-------------------");
        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();
        System.out.println("---------------------");

        Student s3 = new Student();
        s3.name = "司文豪";
        s3.score = 350;
        s3.printPass(428);

    }
}
