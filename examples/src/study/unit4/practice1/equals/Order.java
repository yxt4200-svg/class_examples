package study.unit4.practice1.equals;

public class Order {
    int orderId;
    String orderName;

    public Order(){

    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        // 判断传入的对象obj是否是Order类或者Order类的子类的实例
        if(obj instanceof Order){
            // 向下转型，强转的目的是调用子类里特有的属性，因为obj.不出属性
            Order order = (Order) obj;

            return this.orderId == order.orderId && this.orderName.equals(order.orderName);

        }
        return false;
    }
}
