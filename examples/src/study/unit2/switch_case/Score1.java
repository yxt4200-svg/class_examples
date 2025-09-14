/*
大于60输出合格，否则不合格
 */
package study.unit2.switch_case;

public class Score1 {
    public static void main(String[] args) {
        int score = 78;
//        switch(score / 10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("不合格");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("合格");
//                break;
//            default:
//                System.out.println("分数有误");
//                break;

        switch(score / 60){
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("分数有误");
                break;
        }
    }
}
