package study.unit4.practice2.abstracttest;

public class Manager extends Employee{
    private double bonus; // 奖金

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行效率");
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
