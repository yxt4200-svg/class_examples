/*
构造器＋this练习
 */

package study.unit4.practice;

public class BoysAndGirlsTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();

        Girl girl = new Girl("朱丽叶",18);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台",19);
        int compare = girl.compare(girl1);
        if(compare > 1){
            System.out.println(girl.getName() + "年龄大");
        } else if (compare < 1) {
            System.out.println(girl1.getName() + "年龄大");
        }else {
            System.out.println("一样大");
        }
    }
}

class Boy{
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());

    }

    public void shout(){
        if(age >= 22){
            System.out.println("可以登记结婚了");
        }else {
            System.out.println("年龄不达标");
        }
    }
}

class Girl{
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this); // 表示传入当前女孩，不要输入this.name
    }

    /**
     * @Description 比较两个对象的大小
     * @author xiaotong
     * @date 2025/9/19 20:17
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
//        if(this.age > girl.age){
//            return 1;
//        } else if (this.age < girl.age) {
//            return -1;
//        }else {
//            return 0;
//        }
        return this.age - girl.age;
    }

}