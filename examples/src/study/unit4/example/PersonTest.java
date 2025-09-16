/*
属性 = 成员变量 = field = 域、字段
方法 = 成员方法 = 函数 = method

创建类的对象 = 类的实例化 = 实例化类
 */

package study.unit4.example;

// 测试类
public class PersonTest {
    public static void main(String[] args) {
        // 创建Person类的对象
        Person p1 = new Person();

        // 调用属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        // 调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);

        // 将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间中的
        Person p3 = p1;
        System.out.println(p3.name);

        p3.age = 10;
        System.out.println(p1.age);

    }
}

class Person{
    // 属性
    String name;
    int age = 1;
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人会说话" + language);
    }

}