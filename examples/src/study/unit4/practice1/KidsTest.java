/*
继承性练习
 */
package study.unit4.practice1;

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(12);
        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employeed();
        someKid.manOrWoman();
    }
}
