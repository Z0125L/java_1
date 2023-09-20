package com.zl.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //认识多个变量指向同一个数组对象的形式，并掌握其注意事项
        int[] arr1 = {11, 22, 33};

        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("----------------------------------");
        arr1[1] = 99;
        System.out.println(arr2[1]);
        arr2 = null;
        System.out.println(arr2);
        //System.out.println(arr2[0]); 不能访问里面的元素，会出bug，显示为空指针异常
        //System.out.println(arr2.length); 不能访问数组长度，会出bug，显示为空指针异常
    }
}
