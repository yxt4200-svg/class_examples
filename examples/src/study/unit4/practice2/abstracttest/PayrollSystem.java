package study.unit4.practice2.abstracttest;

import java.util.Scanner;
import study.unit4.practice2.abstracttest.MyDate;

/*
* 定义PayrollSystem类，创建Employee变量数组并初始化，
* 该数组存放各类雇员对象的引用。
* 利用循环结构遍历数组元素，输出各个对象的类型,
* name,number,birthday。
* 当键盘输入本月月份值时，
* 如果本月是某个Employee对象的生日，
* 工资增加100元,还要输出增加工资信息。
* */
public class PayrollSystem {
    // 是数组名为Employee，不是创建了Employee类的对象
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入当前月份");
        int month = scan.nextInt();

        Employee[] emps = new Employee[2];

        // 多态
        emps[0] = new SalariedEmployee("马森",1002,new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("安雨",1003,new MyDate(1993,1,6),60,240);

        for(int i = 0;i < emps.length;i++){
            double salary = emps[i].earnings();
            System.out.println(emps[i]);
            System.out.println("月工资为：" + emps[i].earnings());

            if(month == emps[i].getBirthday().getMonth()){
                salary += 100;
                System.out.println("生日快乐，奖励100元");

                System.out.println(emps[i]);
                System.out.println("月工资为：" + salary);
            }
        }
    }
}
