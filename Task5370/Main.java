package Task5370;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Person để gán làm người mua
        Person person1 = new Person("Anh Dev", 25);

        // Subtask 2: Khởi tạo 4 đối tượng Order2
        Order2 o1 = new Order2("Nguyen Van A");

        String[] dsHang = { "Laptop Dell", "Chuột Logitech" };
        Order2 o2 = new Order2(101, "Tran Thi B", 25000000L, new Date(), true, dsHang, person1);

        Order2 o3 = new Order2();

        Order2 o4 = new Order2(102, "Le Van C", 500000L);

        // Cho vào ArrayList
        ArrayList<Order2> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);

        // Subtask 3: In kết quả định dạng VN
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vnMoney = NumberFormat.getCurrencyInstance(localeVN);
        SimpleDateFormat vnDate = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("========== DANH SÁCH ORDER2 ==========");
        for (Order2 o : list) {
            System.out.println("Đơn hàng: " + o.customerName);
            System.out.println("Giá: " + vnMoney.format(o.price));
            if (o.orderDate != null)
                System.out.println("Ngày: " + vnDate.format(o.orderDate));

            // In toàn bộ qua toString() đã override
            System.out.println("Chi tiết toString(): " + o.toString());
            System.out.println("--------------------------------------");
        }
    }
}