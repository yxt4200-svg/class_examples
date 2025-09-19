package study.unit4.practice;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();

        test.mOL(2);
        test.mOL(3,4);
        test.mOL("123456");

        System.out.println();

        int maxNumber1 = test.max(6,3);
        System.out.println(maxNumber1);
        double maxNumber2 = test.max(6.2,3.3);
        System.out.println(maxNumber2);
        double maxNumber3 = test.max(6.2,3.3,5.5);
        System.out.println(maxNumber3);
    }
    public void mOL(int i){
        System.out.println((int) (Math.sqrt(i)));
    }

    public void mOL(int i,int j){
        System.out.println(i * j);
    }

    public void mOL(String s){
        System.out.println(s);
    }

    public int max(int i,int j){
        return (i > j)?i : j;
    }

    public double max(double i,double j){
        return (i > j)?i : j;
    }

    public double max(double i,double j,double k){
        double temp = (i > j)?i : j;
        return (temp > k)?temp : k;
    }
}
