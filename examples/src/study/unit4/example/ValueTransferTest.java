/*
 *方法的形参的传递机制：值传递（不叫引用传递）
 *
 *值传递机制：
 *  如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 *  如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 *
 */
package study.unit4.example;

public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("m:" + m + ",n:" + n);

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;
        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId= " + o2.orderId);

        o2.orderId = 1002;

        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId= " + o2.orderId);
    }

}

class Order{
    int orderId;
}