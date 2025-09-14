package study.unit2.if_else;

public class NumberSplitter {
    public static void main(String[] args) {
        int num = 351;
        for(int i = 0 ; i < 3 ; i++ ){
            int temp = num % 10;
            System.out.println(temp); // 取末位并输出
            num /= 10;                     // 移除末位
        }
    }
}