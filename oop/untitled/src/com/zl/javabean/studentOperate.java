package com.zl.javabean;

public class studentOperate {
    private Student student;

    public studentOperate(Student student) {
        this.student = student;
    }
    public void printPass(){
        if(student.getScore()>60){
            System.out.println(student.getName()+"成绩及格");
        }else {
            System.out.println(student.getName()+"成绩不及格");
        }
    }
}
