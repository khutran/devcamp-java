package Task54B50;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // --- subTask 4: Khởi tạo và in thông tin 2 Khách hàng ---
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        Customer customer2 = new Customer(99, "Paul Tan", 20);

        System.out.println("--- Subtask 4: Khach hang ---");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println();

        // --- subTask 5: Khởi tạo và in thông tin 2 Tài khoản ---
        // account1: có số dư ban đầu
        Account account1 = new Account(101, customer1, 888.8);
        // account2: không truyền số dư (mặc định là 0.0)
        Account account2 = new Account(102, customer2);

        System.out.println("--- Subtask 5: Tai khoan ---");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Thử nghiệm nạp tiền và rút tiền theo mô hình UML
        System.out.println("\n--- Thu nghiem Nap/Rut tien ---");
        account1.deposit(111.2);
        System.out.println("Sau khi nap $111.2: " + account1);

        account1.withdraw(2000.0); // Thử rút quá số dư -> In thông báo lỗi
        account1.withdraw(500.0);
        System.out.println("Sau khi rut $500.0: " + account1);
    }
}