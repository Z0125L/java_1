package com.zl;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //          开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母。
        System.out.println(createCode(5));
    }
    public static String createCode(int n){
        //定义一个for循环，来生成随机数的个数
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            //为每个位置生成一个随机字符，可能是数字，大写字母或小写字母
            //0代表数字，1代表大写字母，2代表小写字母
            int type = r.nextInt(3);
            switch (type){
                case 0 :
                    code+=r.nextInt(10);
                    break;
                case 1:
                    //大写字母A-Z
                    //A 65  Z  80
                    char ch1 = (char) (r.nextInt(26)+65);
                    code+=ch1;
                    break;
                case 2:
                    char ch2 = (char) ((char)r.nextInt(26)+97);
                    code+=ch2;
                    break;
            }
        }
        return code;
    }
}
