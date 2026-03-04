package Task54A50;

public class Main {
    public static void main(String[] args) {
        // Test 3: Khởi tạo 2 đối tượng tài khoản
        Account account1 = new Account("A101", "Tan"); // balance mặc định = 0
        Account account2 = new Account("A102", "Dung", 1000);

        System.out.println("--- Test 3: Khởi tạo ban đầu ---");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Test 4: Tăng tài khoản 1 (+2000) và tài khoản 2 (+3000)
        account1.credit(2000);
        account2.credit(3000);
        System.out.println("\n--- Test 4: Sau khi nạp tiền (credit) ---");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Test 5: Giảm tài khoản 1 (-1000) và tài khoản 2 (-5000)
        System.out.println("\n--- Test 5: Thực hiện rút tiền (debit) ---");
        account1.debit(1000);
        account2.debit(5000); // Sẽ báo lỗi vì balance chỉ có 4000
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Test 6: Chuyển 2000 từ TK1 sang TK2
        System.out.println("\n--- Test 6: Chuyển 2000 từ TK1 -> TK2 ---");
        account1.transferTo(account2, 2000); // Sẽ báo lỗi vì TK1 chỉ còn 1000
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        // Test 7: Chuyển 2000 từ TK2 sang TK1
        System.out.println("\n--- Test 7: Chuyển 2000 từ TK2 -> TK1 ---");
        account2.transferTo(account1, 2000); // Thành công
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
