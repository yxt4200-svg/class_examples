/*
类中方法的声明和使用

方法：描述应该具有的功能

声明：权限修饰符 返回值类型 方法名(形参列表){
        方法体
    }

说明：1.权限修饰符（封装性讲）
     2.返回值类型：有返回值 vs 没有返回值
       2.1有返回值，方法声明时要指定返回值类型。
          同时，方法中要使用return关键字来返回指定类型的变量或常量,"return 数据"。
       2.2没有返回值，方法声明时使用void。
           通常没有返回值的方法中不用return;如果使用，"return"，表示结束方法。
       2.3定义方法要不要有返回值？
          题目要求要写
          凭经验，比如random方法，自己定义的binary方法
     3.方法名：标识符，见名知意
     4.形参列表：
       4.1可多个形参，用逗号隔开
       4.2定义方法要不要定义形参
          题目要求要写
          凭经验，sort方法，你要给谁排，sort(int[] arr)
     5.方法体：方法功能的体现

return关键字的使用：
    1.适用范围：使用在方法体中
    2.作用：返回数据并结束方法（有返回值）/结束方法（无返回值）
    3.注意：return后面不可以声明执行语句

方法的使用中，可以调用当前类的属性或方法
    特殊的：方法A中又调用了方法A：递归方法
方法中不可以定义方法

 */

package study.unit4.example;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer();

        cust.eat();
    }
}

class Customer{
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("我今天吃了米饭");
    }
}