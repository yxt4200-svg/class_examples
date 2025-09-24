package study.unit4.practice1.polymorphic;

public class GeometricTest {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(2.0);
        MyRectangle myRectangle = new MyRectangle(1.0,2.0);

        GeometricTest test = new GeometricTest();
        test.equalsArea(circle1,myRectangle);
        test.displayGeometricObject(circle1,myRectangle);

        // 老师的代码
//        test.displayGeometricObject(circle1);
//        test.displayGeometricObject(myRectangle);
//
//        boolean isEquals = test.equalsArea(circle1,myRectangle);
//        System.out.println("两个对象的面积是否相等" + isEquals);

    }

    public void equalsArea(Circle1 c,MyRectangle m){
        double area1 = c.findArea();
        double area2 = m.findArea();

        if(area1 == area2){
            System.out.println("两个对象的面积相等");
        }else {
            System.out.println("两个对象的面积不相等");
        }
    }

    public void displayGeometricObject(Circle1 c,MyRectangle m){
        System.out.println("圆形的面积为：" + c.findArea());
        System.out.println("矩形的面积为：" + m.findArea());
    }

//    public void displayGeometricObject(GeometricObject o){
//        System.out.println("面积为：" + o.findArea());
//    }
//
//    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
//        return o1.findArea() == o2.findArea();
//    }
}
