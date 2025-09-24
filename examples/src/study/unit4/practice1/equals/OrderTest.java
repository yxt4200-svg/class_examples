package study.unit4.practice1.equals;
/*
Object类之练习8
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(20, "123");
        Order o2 = new Order(20, "456");

        System.out.println(o1.equals(o2));

        Order o3 = new Order(20, "456");
        System.out.println(o2.equals(o3));
    }
}
