package study.unit4.practice;

public class Account{
    private int id; // 账号
    private double balance; // 余额
    private double annualInteresRate; // 年利率

    public Account(){

    }

    public Account(int id, double balance, double annualInteresRate){
        this.id = id;
        this.balance = balance;
        this.annualInteresRate = annualInteresRate;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInteresRate(){
        return annualInteresRate;
    }

    public void setAnnualInteresRate(int annualInteresRate){
        this.annualInteresRate = annualInteresRate;
    }

    // 取钱的方法
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出" + amount + "元");
    }

    // 存钱的方法
    public void deposit(double amout){
        if (amout > 0){
            balance += amout;
            System.out.println("成功存入：" + amout + "元");
        }
    }
}