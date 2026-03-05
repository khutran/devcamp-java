package Task54B50;

// File: Customer.java
public class Customer {
    private int id;
    private String name;
    private int discount; // Giảm giá tính theo phần trăm

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Các phương thức Getter và Setter
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString định dạng: "name(id)(discount%)"
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}