package Task54A50;

public class Account {
    // Các thuộc tính (Fields)
    private String id;
    private String name;
    private int balance = 0; // Giá trị mặc định là 0

    // 1. Constructor không có balance
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 2. Constructor có balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Các phương thức Getter
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Nạp tiền vào tài khoản
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Rút tiền khỏi tài khoản
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Chuyển tiền sang tài khoản khác
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Phương thức toString trả về chuỗi mô tả đúng định dạng yêu cầu
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}