package com.zl.define;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr1 = {50, 40, 30, 20, 10};

        int i = 0;
        int j = arr1.length-1;

        while (i < j) {

           int temp = arr1[j];
            arr1[j] = arr1[i];
            arr1[i] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr1.length; k++) {
            System.out.println(arr1[k]);
        }
    }
}
