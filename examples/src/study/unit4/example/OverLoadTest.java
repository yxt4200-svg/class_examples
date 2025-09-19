/*
 * 方法的重载
 *
 * 1.定义：在同一个类中，允许在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可
 *        “两同一不同”：同一个类、相同方法名，参数列表（个数、类型、顺序）不同
 * 2.判断是否重载：
 *        跟方法的权限修饰符、返回值类型、形参变量名、方法体都无关
 * 3.通过对象调用方法时，如何确定某一个指定阿方法
 *   方法名--->参数列表
 *
 */

package study.unit4.example;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1,2);
    }
    // 下面四种都可以
    // 要是把下面的方法注释掉，test.getSum(1,2)运行结果为2
    public void getSum(int i,int j){
        System.out.println("1");
    }

    public void getSum(double d1,double d2){
        System.out.println("2");
    }

    public void getSum(String s,int i){
        System.out.println("3");
    }

    public void getSum(int i,String s){
        System.out.println("4");
    }

//    public int getSum(int i,int j){
//        return 0;
//    }

//    public void getSum(int m,int n){
//
//    }

//    private void getSum(int i,int j){
//
//    }
}
