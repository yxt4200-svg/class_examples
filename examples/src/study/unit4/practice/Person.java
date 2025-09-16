package study.unit4.practice;

public class Person {
    String name;
    int age;
    // sex：1为男，2为女
    int sex;

    public void study(){
        System.out.println(name + " is studying");
    }

    public void showAge(){
        System.out.println(name + age + "岁");
    }

    public int addAge(int i){
        this.age += i;
        return age;
    }
}
