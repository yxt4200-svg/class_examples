package study.unit4.practice1.polymorphic;

public class Circle1 extends GeometricObject {
    double radius;

    public Circle1(){
        super();
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
