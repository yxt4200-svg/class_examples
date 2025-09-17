/*
 * 可变个数形参的方法：
 *
 * 具体使用
 * 1.可变个数形参的格式：数据类型 ... 变量名
 * 2.调用时，传入参数可以是0个，1个，2个...
 * 3.可变个数形参的方法与本类方法名相同，与形参类型也相同的数组不构成重载
 * 4.可变个数形参必须写在最后面，最多只能声明一个可变形参
 */
package study.unit4.example1;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show("hello");
        test.show("hello","world");
        test.show();

        System.out.println();

        test.show(1,"hi");

        // test.shoe(new String[]{"AA","BB"});
    }

    public void show(String ... strs){
        System.out.println("show strs");
        for(int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
    }

//    public void show(String[] strs){
//        System.out.println("show strs");
//    }

    public void show(int a,String ... strs){
        System.out.println("show strs");
        for(int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
