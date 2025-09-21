package study.unit4.practice1;

import study.unit4.exer.Account;

/*
继承和super练习
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(){
        super();
    }

    public CheckAccount(int id, double balance, double annualInteresRate,double overdraft){
        super(id,balance,annualInteresRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    public void withdraw(double amount){
        // 错误原因：super只解决子父类问题，无法解决封装性问题，balance是私有的
//        if(amount <= balance){
//            balance -= amount;
//            System.out.println("成功取出：" + balance);
//            System.out.println("您的账户余额：" + balance);
//            System.out.println("您的可透支额：" + overdraft);
//            return;
//        }
//        double overAmount = amount - balance;
//        if(overAmount <= overdraft){
//            super.balnace = 0;
//            overdraft -= overAmount;
//            System.out.println("您的账户余额：" + balance);
//            System.out.println("您的可透支额：" + overdraft);
//            return;
//        }
//        System.out.println("超过可透支的额度!");
//
//    }
        if(amount <= getBalance()){
            // get是获取的功能，我们是想把balance重新赋值，要用set
            // 方法一
            // 但实际中，id,年利率银行可以帮你修改信息
            // 余额是通过存钱取钱变化的，不是直接修改也就是set
            // 第三个方法是把balance改为protected，让子类可以看到，不用set
            // setBalance(getBalance() - amount);
            // 方法二
            super.withdraw(amount);
            return;
        }

        if(amount - getBalance() <= overdraft){
            // 先把透支的额度改了再把余额改为0，这个顺序和操作顺序相反！
            overdraft -= amount - getBalance();
            // 方法1
            // setBalance(0);
            // 方法2
            super.withdraw(getBalance());
            return;
        }
        System.out.println("超过可透支的额度!");

    }

}
