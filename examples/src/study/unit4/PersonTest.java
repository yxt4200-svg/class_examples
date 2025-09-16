/*
属性 = 成员变量 = field = 域、字段
方法 = 成员方法 = 函数 = method

创建类的对象 = 类的实例化 = 实例化类
 */

package study.unit4;

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