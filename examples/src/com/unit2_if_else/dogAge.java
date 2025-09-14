package com.unit2_if_else;

import java.util.Scanner;

public class dogAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入狗狗的年龄");

        int dogAge = scan.nextInt();

        if(dogAge <= 2){
            System.out.println("相当于人类" + (dogAge * 10.5) + "岁");
        }else if(dogAge > 2){
            System.out.println("相当于人类" + (2 * 10.5 + (dogAge - 2) * 4) + "岁");
        }else{
            System.out.println("狗狗还没出生");
        }

        scan.close();
    }

}
