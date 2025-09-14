/*
打印图案
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 */

package study.unit2.for_test;

public class PrintPattern {
    public static void main(String[] args) {
        // 上半部分
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 下半部分
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 5 - i ; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
