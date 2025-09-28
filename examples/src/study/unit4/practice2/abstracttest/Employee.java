package study.unit4.practice2.abstracttest;

import study.unit4.practice2.abstracttest.MyDate;

public abstract class Employee {
    private String name;
    private int id;

    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int id, MyDate birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract void work();

    public abstract double earnings();

    // MyDate是我们自己写的，所以要调toDateString
    // 不然就是调Object中的toString，返回地址值
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", id=" + id +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
