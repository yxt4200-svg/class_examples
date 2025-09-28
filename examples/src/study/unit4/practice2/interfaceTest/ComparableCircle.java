package study.unit4.practice2.interfaceTest;

import study.unit4.practice1.Circle;

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    // 重写equals的用法
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }

        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            // 会精度损失
            // return (int)(this.getRadius() - c.getRadius());
            // 方法一
            if(this.getRadius() > c.getRadius()){
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            }else {
                return 0;
            }
            // 方法二
            // 当属性raadius声明为Double时，可以调用包装类的方法
            // return this.getRadius().compareTo(c.getRadius());
        }else{
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
