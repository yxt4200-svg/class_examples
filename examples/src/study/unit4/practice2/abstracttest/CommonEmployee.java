package study.unit4.practice2.abstracttest;

public class CommonEmployee extends Employee{

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工在生产产品");
    }
}
