package com.zl;

public class Test7_3 {
    public static void main(String[] args) {
        for (int i = 101; i <=200 ; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int n){
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
