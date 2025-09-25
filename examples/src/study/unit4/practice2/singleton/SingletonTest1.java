package study.unit4.practice2.singleton;
/*
* 面试可能要手写
*
* 单例设计模式：
* 1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
*
* 2.如何实现？
*
*
*
* */

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

// 饿汉式
class Bank{
    // 1.私有化类的构造器
    // 为了避免在类的外面调用构造器
    private Bank(){

    }

    // 2.内部创建类的对象
    // 讲了封装性习惯用私有化
    // 4.创建的对象也要是static
    private static Bank instance = new Bank();

    // 3.提供公共的方法，返回类的对象
    // 非静态只能通过造对象才能调用获取实例的方法，才能返回一个对象
    // 想要拿到方法前提是创建对象，死循环，要把方法声明为static
    public static Bank getInstance(){
        // 静态方法只能调静态的结构
        return instance;
    }
}