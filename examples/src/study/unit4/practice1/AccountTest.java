package study.unit4.practice1;
/*
继承和super练习
 */
import study.unit4.exer.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("月利率为：" + account.getAnnualInteresRate());
    }
}


