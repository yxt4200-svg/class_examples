package study.unit4.practice2.anonymous;

public abstract class Person {
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
