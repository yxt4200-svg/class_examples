package study.unit4.practice1.polymorphic;

import study.unit4.practice1.polymorphic.Graduate;
import study.unit4.practice1.polymorphic.Person;
import study.unit4.practice1.polymorphic.Student;

/*
多态之练习5
建立InstanceTest 类，在类中定义方法
method(Person e);
在method中:
(1)根据e的类型调用相应类的getInfo()方法。
(2)根据e的类型执行：
如果e为Person类的对象，输出：
“a person”;
如果e为Student类的对象，输出：
“a student”
 “a person ”
如果e为Graduate类的对象，输出：
“a graduated student”
“a student”
 “a person”
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e){
        String info = e.getInfo();
        System.out.println(info);

        if(e instanceof Graduate){
            System.out.println("a graduate student\na student\na person");
        }

        if (e instanceof Student){
            System.out.println("a student\na person");
        }

        if(e instanceof Person){
            System.out.println("a person");
        }

        // 方式二
//        if(e instanceof Graduate){
//            System.out.println("a graduate student\na student\na person");
//        }else if (e instanceof Student){
//            System.out.println("a student\na person");
//        }else{
//            System.out.println("a person");
//        }
    }

}
