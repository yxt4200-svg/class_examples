package study.unit4.practice2.abstracttest;

import study.unit4.practice2.abstracttest.MyDate;

/*
* 定义SalariedEmployee类继承Employee类，
* 实现按月计算工资的员工处理。该类包括：
* private成员变量monthlySalary；
* 实现父类的抽象方法earnings(),该方法返回monthlySalary值；
* toString()方法输出员工类型信息及员工的name，number,birthday。

*
* */

public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int id, MyDate birthday) {
        super(name, id, birthday);
    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int id, MyDate birthday, double monthlySalary) {
        super(name, id, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void work() {
        System.out.println("员工在生产产品");
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    // 调用父类的toString方法，它是非抽象类的
    public String toString(){
        return "SalariedEmployee[" +
                super.toString() +
                "]";
    }
}
