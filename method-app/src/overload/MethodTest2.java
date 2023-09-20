package overload;

public class MethodTest2 {
    public static void main(String[] args) {
       //应用场景：
        //开发武器系统，功能需求如下：
       // 可以默认发一枚武器。
       // 可以指定地区发射一枚武器。
       // 可以指定地区发射多枚武器
        fire();
        //fire("老美");
       // fire("小日本",999);
    }
    public static void fire(){
        //System.out.println("给小日本送东风快递");
        fire("小日本");
    }
    public static void fire(String country){
        //System.out.println("给"+country+"送一个东风快递");
        fire("日本",1000);
    }
    public static void fire(String country,int number){
        System.out.println("给"+country+number+"枚东风快递");
    }
}
