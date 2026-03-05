package Task54B30;

// File: Invoice.java
public class Invoice {
    // Các thuộc tính private
    private int id;
    private Customer customer; // Quan hệ thành phần (Composition)
    private double amount;

    // Hàm khởi tạo (Constructor)
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Các phương thức Getter và Setter
    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Các phương thức truy xuất thông tin từ đối tượng customer
    public int getCustomerID() {
        return customer.getID();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Tính số tiền sau khi đã áp dụng giảm giá
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}