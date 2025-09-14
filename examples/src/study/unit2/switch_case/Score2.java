package study.unit2.switch_case;

import java.util.Scanner;

public class Score2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入分数(0-100):");
        int score = scan.nextInt();

        int flag;
        if(score > 100 || score < 0){
            flag = -1; // 无效值
        } else if (score >= 90) {
            flag = 9; // [90,100]
        } else if (score >= 80) {
            flag = 8; // [80,90)
        } else if (score >= 70) {
            flag = 7; // [70,80)
        } else if (score > 60) {
            flag = 6; // (60,70)
        } else {
            flag = 0;
        }

        switch(flag){
            case 9:
                System.out.println("等级A");
                break;
            case 8:
            case 7:
                System.out.println("等级B");
                break;
            case 6:
                System.out.println("等级C");
                break;
            case 0:
                System.out.println("等级D");
                break;
            default:
                System.out.println("输入的分数无效等级B");
                break;

        }
        scan.close();
    }

}
