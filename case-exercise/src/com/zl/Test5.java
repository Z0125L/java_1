package com.zl;

public class Test5 {
    public static void main(String[] args) {
        //              请把一个整型数组，例如存了数据：11，22，33，拷贝成一个一模一样的新数组出来。
        int[] arr = {11,22,33};
        int[] arr2 = copy(arr);
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/
        ArrayPrint(arr2);
    }
    public static void ArrayPrint(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }
    public static int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
