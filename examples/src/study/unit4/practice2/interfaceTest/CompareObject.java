package study.unit4.practice2.interfaceTest;
/*
* 定义一个接口用来实现两个对象的比较。
* interface CompareObject{
* public int compareTo(Object o);
* 若返回值是 0 , 代表相等;
* 若为正数，代表当前对象大；
* 负数代表当前对象小
}
* */
public interface CompareObject {
    // 虽然没有方法体，但是解释是要的，所以说接口是一种规范
    // 若返回值是 0 , 代表相等;
    // 若为正数，代表当前对象大；
    // 负数代表当前对象小
    public int compareTo(Object o);
}
