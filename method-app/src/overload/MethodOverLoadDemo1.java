package overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        //认识方法重载，并掌握其应用场景
        //方法重载：一个类中，出现多个方法的名称相同，但是它们的形参列表是不同的，那么这些方法就称为方法重载
        test();
        test(100);
    }
    public static void test(){
        System.out.println("====test1====");
    }
    public static void test(int a){
        System.out.println("====test2===="+a);
    }
}
