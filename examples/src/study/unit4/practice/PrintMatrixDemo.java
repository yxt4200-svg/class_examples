/*
打印m行n列的*矩阵，计算其面积，并作为返回值，在main中打印
 */
package study.unit4.practice;

public class PrintMatrixDemo {
    public static void main(String[] args) {
        PrintMatrixDemo matrix = new PrintMatrixDemo();
        matrix.method(8,10);
        // 方法一
        System.out.println(matrix.method(8,10));
        System.out.println();
        // 方法二
        int area = matrix.method(8,10);
        System.out.println("面积：" + area);
    }

    public int method(int m,int n){
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
