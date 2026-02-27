package Task5380;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class Task5380 {

    public static void main(String[] args) {
        // Task 1: Làm tròn
        System.out.println("Task 1 (2.100212, n=2): " + task1(2.100212, 2));
        System.out.println("Task 1 (2100, n=2): " + task1(2100, 2));

        // Task 2: Random trong khoảng
        System.out.println("Task 2 (1, 10): " + task2(1, 10));

        // Task 3: Pytago
        System.out.println("Task 3 (3, 4): " + task3(3, 4));

        // Task 4: Số chính phương
        System.out.println("Task 4 (64): " + task4(64));
        System.out.println("Task 4 (94): " + task4(94));

        // Task 5: Số lớn hơn gần nhất chia hết cho 5
        System.out.println("Task 5 (32): " + task5(32));
        System.out.println("Task 5 (137): " + task5(137));

        // Task 6: Kiểm tra là số
        System.out.println("Task 6 ('12'): " + task6("12"));
        System.out.println("Task 6 ('abcd'): " + task6("abcd"));

        // Task 7: Lũy thừa của 2
        System.out.println("Task 7 (16): " + task7(16));
        System.out.println("Task 7 (18): " + task7(18));

        // Task 8: Số tự nhiên
        System.out.println("Task 8 (-15): " + task8(-15));
        System.out.println("Task 8 (1): " + task8(1));
        System.out.println("Task 8 (1.2): " + task8(1.2));

        // Task 9: Dấu phân cách hàng nghìn
        System.out.println("Task 9 (1000): " + task9(1000));
        System.out.println("Task 9 (10000.23): " + task9(10000.23));

        // Task 10: Thập phân sang Nhị phân
        System.out.println("Task 10 (51): " + task10(51));
        System.out.println("Task 10 (4): " + task10(4));
    }

    // 1. Làm tròn n số sau dấu phẩy (Trả về String để giữ số 0 ở cuối như 2.10)
    public static String task1(double value, int n) {
        return String.format("%." + n + "f", value);
    }

    // 2. Lấy số random trong khoảng [min, max]
    public static int task2(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // 3. Tính cạnh huyền Pytago: c = sqrt(a^2 + b^2)
    public static double task3(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // 4. Kiểm tra số chính phương
    public static boolean task4(int n) {
        if (n < 0)
            return false;
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    // 5. Lấy số lớn hơn hoặc bằng gần nhất chia hết cho 5
    public static int task5(int n) {
        while (n % 5 != 0) {
            n++;
        }
        return n;
    }

    // 6. Kiểm tra chuỗi có phải là số hay không
    public static boolean task6(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // 7. Kiểm tra số có phải lũy thừa của 2 (1, 2, 4, 8, 16...)
    public static boolean task7(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 8. Kiểm tra số tự nhiên (Số nguyên >= 0)
    public static boolean task8(double n) {
        return n >= 0 && n == (int) n;
    }

    // 9. Thêm dấu phẩy ngăn cách hàng nghìn
    public static String task9(double n) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');

        // Nếu là số nguyên thì không hiện phần thập phân, nếu có lẻ thì hiện tối đa 2
        // chữ số
        DecimalFormat df = new DecimalFormat("#,###.##", symbols);
        return df.format(n);
    }

    // 10. Chuyển từ hệ thập phân sang nhị phân
    public static String task10(int n) {
        return Integer.toBinaryString(n);
    }
}