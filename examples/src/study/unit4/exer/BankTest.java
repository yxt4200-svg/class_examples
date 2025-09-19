package study.unit4.exer;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Janme", "Smith");
        bank.getCustomer(0).setAccount(new Account(1000,2000,0.0123));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户" + bank.getCustomer(0).getFistName() + "余额为" + balance + "元");

        bank.addCustomer("万里","杨");
        System.out.println("银行客户个数为：" + bank.getNumberOfCustomers());
    }
}
