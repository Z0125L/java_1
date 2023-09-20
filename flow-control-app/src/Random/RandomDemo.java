package Random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //使用random生成随机数
        Random r = new Random();
        for (int i = 1; i <=20 ; i++)
        {
            int number = r.nextInt(10)+1;
            System.out.println(number);
        }
    }
}
