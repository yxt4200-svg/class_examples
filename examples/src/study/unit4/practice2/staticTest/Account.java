package study.unit4.practice2.staticTest;
/*
编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
码”、“存款余额”、“利率”、“最小余额”，定义封装这些
属性的方法。账号要自动生成。
编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。

 */
public class Account {
    private int id;
    private String pwd = "123456";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001; // 用于自动生成账号

    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        id = init++; // 这里不要漏，创建对象可能是带参创建
        this.pwd = pwd;
        this.balance = balance;
    }

    public String getPwd() {
        return pwd;
    }

    public int getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
