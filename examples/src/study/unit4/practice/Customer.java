package study.unit4.practice;

public class Customer {
    private String fistName;
    private String lastName;
    private Account account;

    public Customer(String fistName,String lastName){
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
