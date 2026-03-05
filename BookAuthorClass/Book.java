package BookAuthorClass;

// File: Book.java
public class Book {
    // Các thuộc tính private
    private String name;
    private Author author; // Quan hệ thành phần (Composition)
    private double price;
    private int qty = 0; // Giá trị mặc định là 0

    // Constructor 1: Không truyền số lượng (qty)
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor 2: Có truyền số lượng (qty)
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Các phương thức Getter và Setter
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Ghi đè phương thức toString, sử dụng lại toString() của lớp Author
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}