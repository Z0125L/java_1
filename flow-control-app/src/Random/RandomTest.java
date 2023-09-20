package Random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        //猜数字游戏
        Random r = new Random();
        int number = r.nextInt(10)+1;

            Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入你猜测的数据：");
            int guess = sc.nextInt();
            if(guess>number)
            {
                System.out.println("猜大了");
            }
            else if(guess<number)
            {
                System.out.println("猜小了");
            }
            else
            {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
