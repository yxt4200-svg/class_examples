/*
输出所有的水仙花数，水仙花数指的是一个三位数，其各个位上数字立方和等于它本身
 */
package study.unit2.for_test;

public class NarcissisticNumbers {
    public static void main(String[] args) {
        for(int i = 100 ; i < 1000 ; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
                System.out.println(i);
            }
        }
    }
}
