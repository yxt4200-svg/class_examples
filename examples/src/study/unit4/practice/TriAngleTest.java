/*
构造器练习:编写两个类，TriAngle和TriAngleTest，
其中TriAngle类中声明私有的底边长base和高height，
同时声明公共方法访问私有变量。
此外，提供类必要的构造器。另一个类中使用这些公共方法，
计算三角形的面积
 */
package study.unit4.practice;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle tri1 = new TriAngle();
        tri1.setBase(12.6);
        tri1.setHeight(6.3);
        System.out.println("tei1面积为：" + tri1.showArea());

        TriAngle tri2 = new TriAngle(10.2, 5.0);
        System.out.println("tri2面积为：" + tri2.showArea());
    }
}

class TriAngle{
    private double base;
    private double height;

    public TriAngle(){

    }

    public TriAngle(double base,double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double showArea(){
        return ((base * height) / 2);
    }
}