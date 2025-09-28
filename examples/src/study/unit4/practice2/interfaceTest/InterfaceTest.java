package study.unit4.practice2.interfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.0);
        ComparableCircle c2 = new ComparableCircle(3.0);

        int compareValue = c1.compareTo(c2);

        if (compareValue == 1){
            System.out.println("c1半径大");
        } else if (compareValue == -1) {
            System.out.println("c2半径大");
        }else {
            System.out.println("c1和c2半径一样大");
        }


    }
}
