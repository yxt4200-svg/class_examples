/*
老师版本1
 */

package study.unit4.practice;

public class PupilTest {
    public static void main(String[] args) {
        // 先创建数组
        Pupil[] s = new Pupil[20];
        // 初始化20个学生对象
        for(int i = 0;i < s.length;i++){
            // 再创建对象
            s[i] = new Pupil();
            // 学号为 1 到 20
            s[i].number = i + 1;
            // 年级(1-6)和成绩(0-100)都由随机数确定
            s[i].state = (int)(Math.random() * 6 + 1);
            s[i].score = (int)(Math.random() * 101);
        }

        // 遍历学生数组，如果年级是3，则调用打印学生信息的功能
        for(int i = 0;i < s.length;i++){
            if(s[i].state == 3){
                System.out.println(s[i].Info());
            }
        }

        System.out.println();

        // 按成绩冒泡排序（升序）
        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s.length - 1 - i;j++){
                if(s[j+1].score < s[j].score){
                    Pupil temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }

        // 打印排序后的信息
        for(int i = 0;i < s.length;i++){
                System.out.println(s[i].Info());
        }
    }

}

class Pupil{
    // 属性
    int number; // 学号
    int state;  // 年级
    int score;  // 成绩

    // 打印学生信息的 方法
    public String Info(){
        return "学号：" + number + " 年级：" + state + " 成绩：" + score;
    }
}
