package com.zl.thisDeno;

public class Student {
    double score;
    String name;
    public void printThis(){
        System.out.println(this);
    }
    public void printPass(double score){
        if(this.score > score){
            System.out.println(name+"恭喜你考上大学");
        }else {
            System.out.println(name+"只能回家种地了");
        }
    }
}
