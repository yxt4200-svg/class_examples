/*
判断某天是某年的第几天
 */

package com.unit2_switch_case;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入year");
        int year = scan.nextInt();
        System.out.println("请输入month");
        int month = scan.nextInt();
        System.out.println("请输入day");
        int day = scan.nextInt();

        int sumDays = 0;

        switch (month) {
            case 12:
                sumDays += 30; // 11月的天数
            case 11:
                sumDays += 31; // 10月的天数
            case 10:
                sumDays += 30; // 9月的天数
            case 9:
                sumDays += 31; // 8月的天数
            case 8:
                sumDays += 31; // 7月的天数
            case 7:
                sumDays += 30; // 6月的天数
            case 6:
                sumDays += 31; // 5月的天数
            case 5:
                sumDays += 30; // 4月的天数
            case 4:
                sumDays += 31; // 3月的天数
            case 3:
                // 判断是否为闰年，确定2月的天数
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31; // 1月的天数
            case 1:
                sumDays += day; // 当月的天数
                break;
            default:
                System.out.println("月份输入错误");
                return;
        }
        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
        scan.close();
    }
}
