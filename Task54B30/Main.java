package Task54B30;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // --- subTask 4: Khởi tạo và in thông tin 2 Khách hàng ---
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        Customer customer2 = new Customer(99, "Paul Tan", 20);

        System.out.println("--- Danh sach Khach hang (subTask 4) ---");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println();

        // --- subTask 5: Khởi tạo và in thông tin 2 Hóa đơn ---
        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        Invoice invoice2 = new Invoice(102, customer2, 999.9);

        System.out.println("--- Danh sach Hoa don (subTask 5) ---");
        System.out.println(invoice1.toString());
        System.out.println("So tien sau giam gia cua HD 101: " + invoice1.getAmountAfterDiscount());

        System.out.println(invoice2.toString());
        System.out.println("So tien sau giam gia cua HD 102: " + invoice2.getAmountAfterDiscount());
    }
}