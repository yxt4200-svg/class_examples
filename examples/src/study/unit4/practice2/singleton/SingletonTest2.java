package study.unit4.practice2.singleton;
/*
* 懒汉式：要用的时候才造对象
* */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

class Order{
    // 1.私有化类的构造器
    private Order(){

    }

    // 2.先声明当前类对象，没有初始化
    // 4.此对象也必须声明为static
    private static Order instance = null;

    // 3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            // 因为每次调用方法都会新建一个对象
            // 即使每次都赋值给instance，但不是原来唯一的那个对象，所以要加id条件
            instance = new Order();
        }
        return instance;
    }

}