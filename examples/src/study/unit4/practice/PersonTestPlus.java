/*
封装和构造器练习
 */
package study.unit4.practice;

public class PersonTestPlus {
    public static void main(String[] args) {
        PersonPlus p1 = new PersonPlus();
        p1.setAge(15);
        System.out.println("年龄为：" + p1.getAge());

        PersonPlus p2 = new PersonPlus(21,"Tom");
        System.out.println("名字为：" + p2.getName() + " 年龄为：" + p2.getAge());

    }
}

class PersonPlus{
    private int age;
    private String name;

    public PersonPlus(){
        this.age = 18;
    }

    public PersonPlus(int age,String name){
        setAge(age);
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 130){
            this.age = age;
            return ;
        }
        throw new RuntimeException("年龄必须在0-130之间，当前值：" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}