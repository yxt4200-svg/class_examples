/*
质数问题优化一
 */
package study.unit2.for_test;

public class PrimeNumberTest1 {
    public static void main(String[] args) {
        boolean isFlag = true;
        int count = 0;

        //获取当前时间举例11970-01-01 00：00：00 的毫秒数
        long start = System.currentTimeMillis();

        for(int i = 2;i <= 100000;i++){

            for(int j = 2;j < i;j++){

                if(i % j == 0){
                    isFlag = false;
                    break; // 发现能被除尽，后面的数就不考虑，只对非质数有作用
                }

            }
            if(isFlag){
                //System.out.println(i);
                count++;
            }
            // 不直接把boolean isFlag = true;放在第一层循环下面是为了减少内存开销
            isFlag = true;
        }
        //获取当前时间举例11970-01-01 00：00：00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("count=" + count);

        System.out.println("所花费的时间为：" + (end - start));
    }
}
