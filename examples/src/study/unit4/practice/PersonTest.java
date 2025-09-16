package study.unit4.practice;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name + "新年龄为" + newAge + "岁");

        System.out.println(p1.age); // 20岁

        Person p2 = new Person();
        p2.showAge(); // 0岁
        p2.addAge(10);
        p2.name = "Lisa";
        p2.showAge();
    }
}
