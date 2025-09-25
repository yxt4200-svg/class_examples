package study.unit4.practice1.wrapper;
/*
利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），
找出最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
长度。而向量类java.util.Vector可以根据需要动态伸缩。
创建Vector对象：Vector v=new Vector();
 给向量添加元素：v.addElement(Object obj);   //obj必须是对象
取出向量中的元素：Object  obj=v.elementAt(0);
 注意第一个元素的下标是0，返回值是Object类型的。
计算向量的长度：v.size();
 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 */
import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        // 1.获取学生成绩，实例化Scanner
        Scanner scan = new Scanner(System.in);

        // 2.创建Vector对象
        Vector v = new Vector<>();

        // 3.给向量添加元素
        int maxScore = 0;
        for(;;){
            System.out.println("请输入学生成绩（输入负数结束输入）:");
            int score = scan.nextInt();

            // 以负数代表输入结束
            if(score < 0){
                break;
            }

            if(score > 100){
                System.out.println("输入的数据非法！请重新输入");
                continue;
            }

            // 添加元素
            v.addElement(score);// 自动装箱

            // 4.获取学生成绩的最大值
            if(maxScore < score){
                maxScore = score;
            }
        }

        char level = 0;
        // 5.遍历Vec，得到每个学生的成绩，并与最大值比较，得出等级
        for(int i = 0;i < v.size();i++){
            // 取元素
            Object obj = v.elementAt(i);
            int score = (int)obj; // 自动拆箱
            int difference = maxScore - score;

            if(difference <= 10){
                level = 'A';
            } else if (difference <= 20) {
                level = 'B';
            } else if (difference <= 30) {
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student-" + i + "'s score is " + score + " and level is " + level);
        }
    }

}
