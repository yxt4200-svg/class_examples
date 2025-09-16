/*
对象数组题目（很好的题目，反复做）
定义类 Student，包含三个属性：学号 number (int)，年级 state (int)，成绩 score (int)。
创建 20 个学生对象，学号为 1 到 20，年级和成绩都由随机数确定。
问题一：打印出 3 年级（state 值为 3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1）生成随机数：Math.random ()，返回值类型 double；
2）四舍五入取整：Math.round (double d)，返回值类型 long。

原版
错误1：在for循环里面创建数组，并且没有创建对象
错误2：在学生类里面定义打印3年级学生信息的方法
      打印 3 年级所有学生”是对一组学生对象的操作，不属于单个学生的行为。
      这种“批量处理多个对象”的逻辑，更适合放在测试类中，作为 工具性操作
修改第一版
错误3：在main方法里调用方法并定义打印3年级学生信息的方法，方法没有用static修饰
修改第二版
错误4：在main方法外调用方法并定义打印3年级学生信息的方法，方法没有用static修饰
      正确为main里面调用方法，main外面定义方法
      加static修饰，确保static的main方法可以直接调用
 */
package study.unit4.practice;

public class StudentTest {
    public static void main(String[] args) {
        // 先创建数组
        Student[] s = new Student[20];
        // 初始化20个学生对象
        for(int i = 0;i < s.length;i++){
            // 再创建对象
            s[i] = new Student();
            // 学号为 1 到 20
            s[i].number = i + 1;
            // 年级(1-6)和成绩(0-100)都由随机数确定
            s[i].state = (int)(Math.random() * 6 + 1);
            s[i].score = (int)(Math.random() * 101);
        }
        // 调用静态方法
        printGrade3(s);

        // 按成绩冒泡排序（升序）
        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s.length - 1 - i;j++){
                if(s[j+1].score < s[j].score){
                    Student temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }

        // 调用非静态方法
        // 先创建StudentTest的对象
        StudentTest test = new StudentTest();
        // 通过对象调用非静态方法
        test.outputGrade(s);
    }
    // 打印出3年级学生信息的静态方法
    public static void printGrade3(Student[] s){
        System.out.println("打印出3年级学生信息的静态方法：");
        for(int i = 0;i < s.length;i++){
            if(s[i].state == 3){
                System.out.println("学号：" + s[i].number + " 年级：" + s[i].state + " 成绩：" + s[i].score);
            }
        }
        System.out.println();
    }

    // 打印出所有学生信息的非静态方法
    public void outputGrade(Student[] s){
        System.out.println("打印出所有学生信息的非静态方法：");
        for(int i = 0;i < s.length;i++){
                System.out.println("学号：" + s[i].number + " 年级：" + s[i].state + " 成绩：" + s[i].score);
        }
    }
}

class Student{
    // 属性
    int number; // 学号
    int state;  // 年级
    int score;  // 成绩
}