/*
输出100以内的所有质数
质数：只能被1和它本身整除的自然数
从2开始遍历，到它本身-1的数
 */

package study.unit2.for_test;

public class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true; // 标识i能否被j除尽，一旦被除尽。修改其值
        for(int i = 2;i <= 100;i++){
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    isFlag = false;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
            // 不直接把boolean isFlag = true;放在第一层循环下面是为了减少内存开销
            isFlag = true;
        }
    }
}
