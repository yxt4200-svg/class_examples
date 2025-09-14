/*
从键盘读入个数不确定的整数，并判断读入的数分别为正数和负数的个数，当输入0时程序结束
 */
package study.unit2.while_test;

import java.util.Scanner;

public class PositiveNegativeCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入整数：");

        int positiveNumberCount = 0;
        int negativeNumberCount = 0;

        while(true){
            int num = scan.nextInt();;
            if(num > 0){
                positiveNumberCount++;
            }else if (num < 0){
                negativeNumberCount++;
            }else{
                break;
            }
        }
        System.out.println("正数个数为：" + positiveNumberCount);
        System.out.println("负数个数为：" + negativeNumberCount);

        scan.close();
    }
}
