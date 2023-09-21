package com.zl.demo;

import java.util.Scanner;

public class Test {
    //展示系统中的全部电影(每部电影展示：名称、价格)。
    //允许用户根据电影编号（id）查询出某部电影的详细信息。
    // 1、设计一部电影类
    // 2、设计一部电影的操作类
    // 3、准备 全部电影数据
    //电影数据：
    //         1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看"
    //         2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看"
    //         3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看"
    //         4,"一点就到家", 35, 8.7, "许宏宇", "刘昊然","10.8万人想看"
    // 4、创建一部电影操作类的对象，接收电影数据，并对其进行业务处理
    public static void main(String[] args) {
        movie[] movies = new movie[4];
        movies[0] = new movie( 1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看");
        movies[1] = new movie( 2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看");
        movies[2] = new movie( 3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看");
        movies[3] = new movie( 4,"一点就到家", 35, 8.7, "许宏宇", "刘昊然","10.8万人想看");
        MovieOperator operator = new MovieOperator(movies);
        //operator.pintAllMovies();
       // operator.search(1);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------电影信息系统--------");
            System.out.println("1.查询全部电影");
            System.out.println("2.根据id查询某部电影的详情信息");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    operator.pintAllMovies();
                    break;
                case 2 :
                    System.out.println("请输入要查询的id");
                    int id = sc.nextInt();
                    operator.search(id);
                    break;
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }
}
