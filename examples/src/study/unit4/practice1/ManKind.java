package study.unit4.practice1;

public class ManKind {
    int sex; // 性别，0表示woman，1表示man
    int salary; // 工资,0表示no job,1表示job

    public ManKind(){

    }

    public ManKind(int sex, int salary){
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex(){
        return sex;
    }

    public void setSex(int sex){
        this.sex = sex;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
            return;
        }
        System.out.println("woman");
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
            return;
        }
        System.out.println("job");
    }
}
