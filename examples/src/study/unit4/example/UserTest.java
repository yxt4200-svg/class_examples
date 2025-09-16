/*
类中属性的使用
属性（成员变量） vs 局部变量
1.相同：
    1.1定义变量的格式：数据类型变量名 = 变量值
    1.2先声明后使用
    1.3变量都有其对应的作用域

2。不同：
    2.1在类中声明的位置不同
    属性：直接定义在类的一堆{}内
    局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

    2.2关于权限修饰符的不同
    属性：可以在声明属性时，指明其权限，使用权限修饰符
        （private\public\protected\不写就是缺省）
    局部变量：不可以使用权限修饰符

    2.3默认初始化值的情况
    属性：类的属性，根据其类型，都有默认初始化值
        记住：整型：0/浮点型：0.0/字符型0或‘\u0000'/布尔型：false/引用数据类型：null
    局部变量：没有初始化值
        意味着，我们在调用局部变量之前，一定要显式赋值
        特别地，形参在调用时，赋值即可

    2.4在内存中加载的位置
    属性：加载到堆空间中（非static）
    局部变量：加载到栈空间
    */
package study.unit4.example;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        u1.talk("日语");
    }
}

class User{
    // 属性
    String name;
    int age;
    boolean isMale;

    // language是形参，也是局部变量
    public void talk(String language){
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat(){
        String food = "noodles"; // 局部变量
        System.out.println("北方人吃" + food);
    }
}
