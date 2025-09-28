package study.unit4.practice2.abstracttest;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Mike",1001,5000,50000);
        manager.work();

        // 多态
        Employee employee = new CommonEmployee("Lily",1002,1000);
        employee.work();

    }
}
