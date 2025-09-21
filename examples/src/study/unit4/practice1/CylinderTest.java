package study.unit4.practice1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0);

        cylinder.setRadius(2.0);

        double volume = cylinder.findVolume();
        System.out.println("体积为:" + volume);

        double area = cylinder.findArea();
        System.out.println("圆柱表面积：" + area);
    }
}
  