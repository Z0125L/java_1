package com.zl.branch;

public class SwitchDemo {
    public static void main(String[] args) {
        //switch语句

        String week = "周日";
        switch (week)
        {
            case "周一" :
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二" :
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三" :
                System.out.println("今晚啤酒，烧烤，小龙虾");
                break;
            case "周四" :
                System.out.println("主动帮助新来的女程序员解决bug");
                break;
            case "周五" :
                System.out.println("今晚吃鸡");
                break;
            case "周六" :
                System.out.println("spa");
                break;
            case "周日" :
                System.out.println("足浴");
                break;
            default:
                System.out.println("你傻了吧，一星期只有7天");
                break;
        }
    }
}
