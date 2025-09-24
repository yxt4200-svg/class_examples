package study.unit4.practice1.polymorphic;

import study.unit4.practice1.polymorphic.GeometricObject;

public class MyRectangle extends GeometricObject {
    double weight;
    double height;

    public MyRectangle(){
        super();
    }

    public MyRectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double weight1, double height) {
        super(color, weight);
        this.weight = weight1;
        this.height = height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return weight * height;
    }
}
