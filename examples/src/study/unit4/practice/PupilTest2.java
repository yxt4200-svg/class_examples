/*
 *老师版本2
 */

package study.unit4.practice;
public class PupilTest2 {
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

        // 通过对象调用非静态方法
        PupilTest2 test = new PupilTest2();

        test.searchState(s,3);

        System.out.println();

        test.sort(s);

        test.print(s);

    }
    // 打印3年级学生信息的方法
    public void searchState(Pupil[] s, int state){
        for(int i = 0;i < s.length;i++){
            if(s[i].score == state){
                System.out.println(s[i].Info());
            }
        }
    }

    // 按成绩冒泡排序（升序）的方法
    public void sort(Pupil[] s){
        for(int i = 0;i < s.length;i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j + 1].score < s[j].score) {
                    Pupil temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
    }

    // 打印所有学生信息的方法
    public void print(Pupil[] s){
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i].Info());
        }
    }

}
