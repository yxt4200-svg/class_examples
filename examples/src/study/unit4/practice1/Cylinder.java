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
        return super.findArea() * length;
    }

    // 返回圆柱的表面积
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * getLength();
    }
}
