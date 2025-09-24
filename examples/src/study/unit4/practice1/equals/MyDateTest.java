package study.unit4.practice1.equals;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2025,3,15);
        MyDate m2 = new MyDate(2025,3,15);

        MyDateTest test = new MyDateTest();
        System.out.println(m1.equals(m2));;
    }
}
