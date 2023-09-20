package com.zl.OperatorDemo;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //关系运算符
        int a = 5;
        int b = 10;
       boolean r = a>b;
        System.out.println(r);
        System.out.println(a<b);


        System.out.println("---------------------------------------");

        //逻辑运算符的使用

        // &   逻辑与
        // |   逻辑或
        // ！  逻辑非
        // ^   逻辑异或

        //例1：手机尺寸必须大于等于6.95，且内存大于等于8

        double size = 6.8;
        int storage = 10;
        boolean rs1 = size >= 6.95 & storage >= 8;
        System.out.println(rs1);

        //例2：手机尺寸要么大于等于6.95，要么内存大于等于8

        boolean rs2 = size >= 6.95 | storage >= 8;
        System.out.println(rs2);
        System.out.println("-----------------------------------------");
        // ^ 前后条件的结果相同返回false，前后条件不同返回ture
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        System.out.println("------------------------------------------");

        // && 短路与  判断结果与 & 相同，过程不同：左边为false，右边则不执行
        // || 短路或  判断结果与 | 相同，过程不同：左边为false，有便则不执行

        int i =10;
        int j =20;
        System.out.println(i > 100 && ++j > 99);
        System.out.println(j);

        int m =10;
        int n =20;
        System.out.println(m > 5 || ++n > 99);
        System.out.println(n);
        System.out.println("------------------------------------------");

        //三目操作符
        double score = 59.5;
        System.out.println(score >= 60 ? "成绩合格" : "成绩不合格");
    }
}
