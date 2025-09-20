package study.unit4.practice1;

public class Circle {
    double radius ; // 半径

    public Circle(){
        double radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * Math.pow(radius,2);
    }
}
