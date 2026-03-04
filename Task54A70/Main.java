package Task54A70;

public class Main {
    public static void main(String[] args) {
        // subTask 3: Khởi tạo 2 đối tượng thời gian
        // Thử nghiệm với các giá trị biên để kiểm tra logic (23:59:59 hoặc 00:00:00)
        Time time1 = new Time(23, 59, 59);
        Time time2 = new Time(0, 0, 0);

        System.out.println("Thời gian ban đầu:");
        System.out.println("Time 1: " + time1.toString());
        System.out.println("Time 2: " + time2.toString());

        System.out.println("------------------------------------");

        // subTask 4: Thực hiện tăng time1 và giảm time2
        System.out.println("Sau khi thực hiện nextSecond() cho Time 1 và previousSecond() cho Time 2:");

        time1.nextSecond(); // Sẽ chuyển thành 00:00:00
        time2.previousSecond(); // Sẽ chuyển thành 23:59:59

        System.out.println("Time 1 mới: " + time1.toString());
        System.out.println("Time 2 mới: " + time2.toString());

        // Kiểm tra tính năng trả về instance (Chaining)
        System.out.println("\nKiểm tra tăng thêm 1 giây nữa cho Time 1: " + time1.nextSecond().toString());
    }
}