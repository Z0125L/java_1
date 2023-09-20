package returndemo;

public class ReturnDemo {
    public static void main(String[] args) {
        //return用法
        division(5,1);
    }
    //除法
    public static void division(int a,int b){
        if(b==0){
            return;
        }
        int c = a/b;
        System.out.println("结果为"+c);
    }
}
