package Task54B50;

// File: Account.java
public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0; // Giá trị mặc định là 0.0

    // Constructor 1: Có truyền số dư
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor 2: Không truyền số dư (mặc định balance = 0.0)
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // Các phương thức Getter và Setter
    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức bổ trợ lấy tên khách hàng
    public String getCustomerName() {
        return customer.getName();
    }

    // Ghi đè toString: sử dụng lại toString() của Customer và làm tròn 2 chữ số
    // thập phân
    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }

    // Nạp tiền: Cộng vào số dư và trả về chính đối tượng Account (method chaining)
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    // Rút tiền: Kiểm tra số dư trước khi trừ
    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}