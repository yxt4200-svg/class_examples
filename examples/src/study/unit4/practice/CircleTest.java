/*
 *利用面向对象的编程方法，设计类Circle计算圆的面积
 */
package study.unit4.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.1;

        // 方法一
        System.out.println(c1.findArea());

        // 方法二
//        c1.findArea();

        PassObjectTest test = new PassObjectTest();
        Circle c =new Circle();
        test.printAreas(c,5);

        System.out.println("now radius is " + c.radius);
    }
}

class PassObjectTest {
    public void printAreas(Circle c,int times){
        System.out.println("Radius\t\tArea");

        for(int i = 1;i <= times;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = times + 1;
    }
}

class Circle{
    // 属性
    double radius;

    // 求圆的面积的方法一
    public double findArea(){
        double area = Math.PI * radius * radius;
        return area;
     }

    // 求圆的面积的方法二
//    public void findArea(){
//        double area = Math.PI * radius * radius;
//        System.out.println("面积为：" + area);
//    }

}