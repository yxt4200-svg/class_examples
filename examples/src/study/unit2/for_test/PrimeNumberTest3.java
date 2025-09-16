package study.unit2.for_test;

public class PrimeNumberTest3 {
    public static void main(String[] args) {
        int count = 0;
        //获取当前时间举例11970-01-01 00：00：00 的毫秒数
        long start = System.currentTimeMillis();

        label:for (int i = 2; i <= 100000; i++) {

            // 对所有数都有效，但对质数更有效
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    continue label;
                }

            }
            // 能执行到这个步骤的，都是质数
            count++;

        }
        //获取当前时间举例11970-01-01 00：00：00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("count=" + count);

        System.out.println("所花费的时间为：" + (end - start));
    }
}
