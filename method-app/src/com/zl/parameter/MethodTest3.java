package com.zl.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        print(arr);
        int[] arr2 = null;
        print(arr2);
        int[] arr3 ={};
        print(arr3);
    }
    public static void print(int[] arr){
        if(arr==null){
            System.out.println("数组为空指针异常");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
          if(i== arr.length-1){
              System.out.print(arr[i]);
          }else{
              System.out.print(arr[i]+",");
          }
        }
        System.out.println("]");
    }
}
