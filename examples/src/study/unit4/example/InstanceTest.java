/*
 * 1.内存解析的说明
 *   1.1 引用类型的变量，只能存两类值
 *       要么是null，要么是地址值（含变量的类型）
 * 2.匿名对象
 *   2.1 理解：创建对象没有显式的赋给一个变量名
 *       显示赋值：Phone p = new Phone();
 *       匿名对象：new Phone();
 *   2.2 特征：只能使用一次
 */
package study.unit4.example;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        // p = null;
        System.out.println(p);

        // 每new一次，就是一个新的对象
        new Phone().price = 1999;
        new Phone().showPrice(); // 0.0

        // 调用非静态方法要通过其对象调用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
        // 这里匿名对象可以调用两次是因为它赋值给了临时变量phone
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();

    }
}



class Phone{
    // 属性
    double price; // 价格

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

    public void showPrice(){
        System.out.println(price);
    }
}
