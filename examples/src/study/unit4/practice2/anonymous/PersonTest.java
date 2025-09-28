package study.unit4.practice2.anonymous;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("抽象类使用方法");
        // 多态
        Person p = new Student("Mike",20);
        p.eat();

        System.out.println("非匿名类、匿名对象使用方法");
        method(new Worker());

        System.out.println("非匿名类、非匿名对象使用方法");
        Worker worker = new Worker();
        method(worker);

        System.out.println("匿名子类、非匿名对象");
        /*
        * 创建了一个匿名子类得对象p
        * 这里并不是new了一个Person类的对象，因为抽象类是不可以new对象的。
        * 这里new的实际上是一个类，这个类是Person的子类，
        * 而且这个子类是匿名的，只是用Person这个父类的名字充当一下
        * */
        Person p1 = new Person() {
            @Override
            public void eat() {
                System.out.println("我要吃面条");
            }
        };
        method(p1);

        System.out.println("匿名子类、匿名对象");
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("我要吃寿司");
            }
        });
    }

    public static void method(Person p){
        p.eat();
    }
}
