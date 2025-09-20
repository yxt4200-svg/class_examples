package study.unit4.practice1;

public class Cylinder extends Circle{
    double length; // 高

    public Cylinder(){
        double length = 1;
    }

    public Cylinder(double length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}
