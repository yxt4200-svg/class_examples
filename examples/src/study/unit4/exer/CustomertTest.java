/*
 *综合练习
 *写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 *该类包括的属性：账号 id，余额 balance,年利率 annuallnterestRate;
 *包含的方法:访问器方法（getter 和 setter方法)，取款方法 withdraw()，存款方法 deposit()。
 */
package study.unit4.exer;

import study.unit4.exer.Account;
import study.unit4.exer.Customer;

public class CustomertTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(1000);

    }
}
