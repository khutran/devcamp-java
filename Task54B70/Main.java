package Task54B70;

// File: Main.java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // --- subTask 4: Khởi tạo và in 2 đối tượng Customer ---
        Customer customer1 = new Customer("Nguyen Van An");
        customer1.setMember(true);
        customer1.setMemberType("Gold");

        Customer customer2 = new Customer("Le Thi Binh");
        // customer2 mặc định không là hội viên

        System.out.println("----- THÔNG TIN KHÁCH HÀNG -----");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println();

        // --- subTask 5: Khởi tạo 2 đối tượng Visit ---
        Date today = new Date();

        // Khởi tạo visit1 cho customer1
        Visit visit1 = new Visit(customer1.getName(), today);
        visit1.setCustomer(customer1); // Liên kết chính xác đối tượng đã tạo ở subTask 4
        visit1.setServiceExpense(500.0);
        visit1.setProductExpense(200.0);

        // Khởi tạo visit2 cho customer2
        Visit visit2 = new Visit(customer2.getName(), today);
        visit2.setCustomer(customer2);
        visit2.setServiceExpense(300.0);
        visit2.setProductExpense(100.0);

        System.out.println("----- THÔNG TIN CHUYẾN ĐI (VISIT) -----");
        System.out.println(visit1.toString());
        System.out.println(visit2.toString());
        System.out.println();

        // --- subTask 6: In tổng chi phí của 2 chuyến đi ---
        System.out.println("----- TỔNG CHI PHÍ -----");
        System.out.println("Tổng chi phí chuyến đi 1: " + visit1.getTotalExpense());
        System.out.println("Tổng chi phí chuyến đi 2: " + visit2.getTotalExpense());
    }
}