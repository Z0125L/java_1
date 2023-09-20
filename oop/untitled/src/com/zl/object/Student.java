package com.zl.object;

public class Student {

        String name;
        double chinese;
        double math;

    public void printTotalScore(){
        System.out.println(name+"总分为"+(chinese+math));
    }
}
