package study.unit2.if_else;

import java.util.Scanner;

public class TicketGame {
    public static void main(String[] args) {
        // double value = Math.random();  // [0.0,1.0]
        // 公式：[a,b] : (int)(Math.random() * (b - a + 1) + a)
        // 生成10 - 99之间的随机数
        int num = (int)(Math.random() * 90 + 10);

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你猜测的两位数");
        int guessNum = scan.nextInt();

        int ge1 = num % 10;
        int shi1 = num / 10;
        int ge2 = guessNum % 10;
        int shi2 = guessNum / 10;

        if(guessNum == num){
            System.out.println("奖励10000美元");
        }else if(ge2 == shi1 && shi2 == ge1){
            System.out.println("奖励3000美元");
        } else if (ge2 == ge1 || shi2 == shi1){
            System.out.println("奖励1000美元");
        } else if (ge2 == shi1 || shi2 == ge1){
            System.out.println("奖励500美元");
        }else{
            System.out.println("彩票作废");
        }

        System.out.println("彩票数字是" + num);

        scan.close(); // 增加关闭资源
    }
}
