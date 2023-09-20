package com.zl;

public class Test4 {
    public static void main(String[] args) {
        //某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是：
        // 对密码中的每位数，都加5,再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，
        // 请设计出满足本需求的加密程序
        System.out.println(encrypt(1983));
    }

    public static String encrypt(int n) {
        //把数字拆分成一个一个
        int[] numbers = split(n);
        //加密
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //反转
        reverse(numbers);
        //输出
        String password = "";
        for (int i = 0; i < numbers.length; i++) {
            password += numbers[i];
        }
        return password;
    }

    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length-1; i < j; i++,j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static int[] split(int n) {
        int[] numbers = new int[4];
        numbers[0] = n / 1000;
        numbers[1] = (n / 100) % 10;
        numbers[2] = (n / 10) % 10;
        numbers[3] = n % 10;
        return numbers;
    }
}

