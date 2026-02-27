package Task5350;

import java.util.Date;

public class Order {
    public int id;
    public String customerName;
    public long price;
    public Date orderDate;
    public boolean confirm;
    public String[] items;

    // 1. Constructor: 1 tham số
    public Order(String paramCustomerName) {
        this.customerName = paramCustomerName;
    }

    // 2. Constructor: Đầy đủ tham số
    public Order(int paramId, String paramCustomerName, long paramPrice, Date paramOrderDate, boolean paramConfirm,
            String[] paramItems) {
        this.id = paramId;
        this.customerName = paramCustomerName;
        this.price = paramPrice;
        this.orderDate = paramOrderDate;
        this.confirm = paramConfirm;
        this.items = paramItems;
    }

    // 3. Constructor: Không tham số
    public Order() {
    }

    // 4. Constructor: 3 tham số
    public Order(int paramId, String paramCustomerName, long paramPrice) {
        this.id = paramId;
        this.customerName = paramCustomerName;
        this.price = paramPrice;
    }
}