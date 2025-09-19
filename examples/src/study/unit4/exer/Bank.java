package study.unit4.exer;

public class Bank {
    private Customer[] customers; // 存储多个客户的数组
    private int numberOfCustomers; // 记录客户的个数

    public Bank(){
        // 构造数组可以写在构造器中，也可以在private Customer[] customers显式赋值
        customers = new Customer[10];
    }

    // 添加客户
    public void addCustomer(String firstName, String lastName){
        Customer cust = new Customer(firstName,lastName);
//        customers[numberOfCustomers] = cust;
//        numberOfCustomers++;
        customers[numberOfCustomers++] = cust;
    }

    // 获取客户的个数
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    // 获取指定位置上的客户
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}
