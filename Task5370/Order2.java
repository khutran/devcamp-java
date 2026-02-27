package Task5370;

import java.util.Arrays;
import java.util.Date;

public class Order2 {
    public int id;
    public String customerName;
    public long price; // Theo Diagram là long, prompt ghi Integer (nên dùng long cho tiền tệ)
    public Date orderDate;
    public Boolean confirm;
    public String[] items;
    public Person buyer; // Object thuộc class Person

    // 1. Constructor: 1 tham số
    public Order2(String paramCustomerName) {
        this.customerName = paramCustomerName;
    }

    // 2. Constructor: Đầy đủ tham số (bao gồm cả Person buyer)
    public Order2(int paramId, String paramCustomerName, long paramPrice, Date paramOrderDate,
            Boolean paramConfirm, String[] paramItems, Person paramBuyer) {
        this.id = paramId;
        this.customerName = paramCustomerName;
        this.price = paramPrice;
        this.orderDate = paramOrderDate;
        this.confirm = paramConfirm;
        this.items = paramItems;
        this.buyer = paramBuyer;
    }

    // 3. Constructor: Không tham số
    public Order2() {
    }

    // 4. Constructor: 3 tham số
    public Order2(int paramId, String paramCustomerName, long paramPrice) {
        this.id = paramId;
        this.customerName = paramCustomerName;
        this.price = paramPrice;
    }

    // Subtask 5: Viết lại method toString()
    @Override
    public String toString() {
        return "Order2 {" +
                "\n  id=" + id +
                ", \n  customerName='" + customerName + '\'' +
                ", \n  price=" + price +
                ", \n  orderDate=" + orderDate +
                ", \n  confirm=" + confirm +
                ", \n  items=" + Arrays.toString(items) +
                ", \n  buyer=" + (buyer != null ? buyer.toString() : "No Buyer Info") +
                "\n}";
    }
}