package com.zl.javabean;

public class Student {
    //这个类中的成员变量都要私有，并且要对外提供相应的getXxx ，setXxx方法
    private String name;
    private double score;
    //类中必须要有一个公共的无参的构造器。

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
