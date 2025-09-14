package com.unit2_if_else;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入岳小鹏期末成绩(0-100分)");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("奖励一辆宝马");
        }else if(score > 80 && score <= 90){
            System.out.println("奖励一台苹果手机");
        }else if(score >= 60 && score <= 80){
            System.out.println("奖励一台平板");
        }else{
            System.out.println("没有奖励");
        }
    }
}
