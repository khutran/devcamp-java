package Task5360;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng user1 (Sử dụng constructor không tham số)
        User user1 = new User();

        // 2. Khởi tạo đối tượng user2 (Sử dụng constructor có tham số)
        User user2 = new User("admin_devcamp", "StrongPassword123", true);

        // 3. Sử dụng Setter để cập nhật thông tin cho user1 nếu muốn
        user1.setUsername("guest_user");
        user1.setEnabled(true);

        // 4. In kết quả ra console bằng phương thức toString
        System.out.println("Thông tin đối tượng user1:");
        System.out.println(user1.toString());

        System.out.println("\nThông tin đối tượng user2:");
        System.out.println(user2.toString());

        // Kiểm tra thử phương thức get
        System.out.println("\nTên đăng nhập của user2 là: " + user2.getUsername());
    }
}