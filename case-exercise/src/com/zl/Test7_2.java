package com.zl;

public class Test7_2 {
    public static void main(String[] args) {
        System.out.println("素数的个数为"+Prime(101, 200));
    }

    public static int Prime(int n, int m) {
        int count = 0;
        OUT:
        for (int i = n; i <= m; i++) {
            for (int j = 2; j < i / 2; j++) {
                if(i%j==0){
                   continue OUT;
                }
            }
            System.out.println(i);
            count++;
        }
        return count;
    }
}
