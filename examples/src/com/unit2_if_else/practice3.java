package com.unit2_if_else;
// 将num1,num2,num3从小到大输出
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []num = new int[4];
        for(int i = 1;i <= 3;i++){
            System.out.println("请输入第" + i + "个整数");
            num[i] = scan.nextInt();
        }

        if(num[1] > num[2]){
            if(num[3] >= num[1]){
                System.out.println(num[2]+ "," + num[1] + "," + num[3]);
            }else if(num[3] <= num[2]){
                System.out.println(num[3] + "," + num[2] + "," + num[1]);
            }else{
                System.out.println(num[2] + "," + num[3] + "," + num[1]);
            }
        }else{
            if(num[3] >= num[2]){
                System.out.println(num[1] + "," + num[2] + "," + num[3]);
            }else if(num[3] <= num[1]){
                System.out.println(num[3] + "," + num[1] + "," + num[2]);
            }else{
                System.out.println(num[1] + "," + num[3] + "," + num[2]);
            }
        }
    }
}
