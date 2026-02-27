package Task5350;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Subtask 3: Khởi tạo 4 object Order với 4 constructor khác nhau
        Order o1 = new Order("Nguyen Van A");

        String[] items4 = { "Iphone 15", "Airpod Pro" };
        Order o2 = new Order(1, "Tran Thi B", 35000000L, new Date(), true, items4);

        Order o3 = new Order();

        Order o4 = new Order(2, "Le Van C", 15000000L);

        // Thêm vào ArrayList
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);

        // Subtask 4: In kết quả theo định dạng VN
        System.out.println("--- DANH SÁCH ĐƠN HÀNG ---");

        // Cấu hình định dạng VN
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vnCurrency = NumberFormat.getCurrencyInstance(localeVN);
        SimpleDateFormat vnDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (Order order : orderList) {
            System.out.println("------------------------------------");
            System.out.println("ID: " + order.id);
            System.out.println("Khách hàng: " + (order.customerName != null ? order.customerName : "N/A"));
            System.out.println("Giá tiền: " + vnCurrency.format(order.price));
            System.out.println("Ngày đặt: " + (order.orderDate != null ? vnDate.format(order.orderDate) : "N/A"));
            System.out.println("Xác nhận: " + (order.confirm ? "Đã xác nhận" : "Chưa xác nhận"));
            System.out.println("Sản phẩm: " + Arrays.toString(order.items));
        }
    }
}