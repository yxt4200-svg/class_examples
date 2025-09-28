package study.unit4.practice2.anonymous;
/*
* 抽象类使用
* */
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生要好好吃饭");
    }
}

// 不重写父类方法，子类也得是抽象类
//public abstract class Student extends Person{
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        super(name, age);
//    }
//}