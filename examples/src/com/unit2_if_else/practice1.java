package com.unit2_if_else;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight = scan.nextFloat();
        System.out.println(weight);

        System.out.println("你是否单身(true/false)");
        boolean isSingal = scan.nextBoolean();
        System.out.println(isSingal);

        // 对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别(男/女)");
        String gender = scan.next(); // "男"
        char genderChar = gender.charAt(0); // 获取索引为0位置上的字符
        System.out.println(genderChar);

    }
}
