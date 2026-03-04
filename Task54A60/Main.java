package Task54A60;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng date1 và date2 với các tham số tự chọn
        // Thử nghiệm với các số nhỏ hơn 10 để kiểm tra định dạng số 0 ở trước
        Date date1 = new Date(1, 1, 2024);
        Date date2 = new Date(25, 12, 2023);

        // Sử dụng phương thức toString để in ra console
        System.out.println("Ngày thứ nhất: " + date1.toString());
        System.out.println("Ngày thứ hai: " + date2.toString());

        // Thử thay đổi giá trị bằng setDate
        System.out.println("--- Sau khi thay đổi ngày 1 ---");
        date1.setDate(9, 5, 2025);
        System.out.println("Ngày thứ nhất mới: " + date1.toString());
    }
}