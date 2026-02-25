import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task52A30 {

    public static void main(String[] args) {
        System.out.println("--- Kết quả Task 52A.30 (String) ---");

        // Task 1
        System.out.println("Task 1 ('Devcamp'): " + task1("Devcamp"));
        System.out.println("Task 1 (1): " + task1(1));

        // Task 2
        System.out.println("Task 2: " + task2("Robin Singh", 4));

        // Task 3
        System.out.println("Task 3: " + Arrays.toString(task3("Robin Singh")));

        // Task 4
        System.out.println("Task 4: " + task4("Robin Singh from USA"));

        // Task 5
        System.out.println("Task 5: " + task5("JavaScript Exercises"));

        // Task 6
        System.out.println("Task 6: " + task6("js string exercises"));

        // Task 7
        System.out.println("Task 7 (n=1): " + task7("Ha!", 1));
        System.out.println("Task 7 (n=2): " + task7("Ha!", 2));
        System.out.println("Task 7 (n=3): " + task7("Ha!", 3));

        // Task 8
        System.out.println("Task 8 (n=2): " + Arrays.toString(task8("dcresource", 2)));
        System.out.println("Task 8 (n=3): " + Arrays.toString(task8("dcresource", 3)));

        // Task 9
        System.out.println("Task 9: " + task9("The quick brown fox jumps over the lazy dog", "the"));

        // Task 10
        System.out.println("Task 10: " + task10("0000", "123"));
    }

    // 1. Kiểm tra giá trị truyền vào có phải chuỗi hay không
    public static boolean task1(Object input) {
        return input instanceof String;
    }

    // 2. Cắt n phần tử đầu tiên của chuỗi
    public static String task2(String str, int n) {
        if (str == null || n > str.length())
            return str;
        return str.substring(0, n);
    }

    // 3. Chuyển chuỗi thành mảng các từ
    public static String[] task3(String str) {
        return str.split("\\s+");
    }

    // 4. Chuyển chuỗi về định dạng lowercase-hyphen
    public static String task4(String str) {
        return str.toLowerCase().replace(" ", "-");
    }

    // 5. PascalCase: Bỏ khoảng trắng, viết hoa chữ cái đầu mỗi từ
    public static String task5(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }
        return result.toString();
    }

    // 6. Viết hoa chữ cái đầu tiên mỗi từ (Title Case)
    public static String task6(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                result.append(Character.toUpperCase(words[i].charAt(0)));
                result.append(words[i].substring(1));
                if (i < words.length - 1)
                    result.append(" ");
            }
        }
        return result.toString();
    }

    // 7. Lặp lại n lần, có khoảng trắng
    public static String task7(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
            if (i < n - 1)
                result.append(" ");
        }
        return result.toString();
    }

    // 8. Đưa chuỗi thành mảng mà mỗi phần tử là n ký tự
    public static String[] task8(String str, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i += n) {
            result.add(str.substring(i, Math.min(str.length(), i + n)));
        }
        return result.toArray(new String[0]);
    }

    // 9. Đếm số lần xuất hiện của chuỗi con (không phân biệt hoa thường)
    public static int task9(String str, String sub) {
        String lowerStr = str.toLowerCase();
        String lowerSub = sub.toLowerCase();
        int count = 0;
        int lastIndex = 0;
        while ((lastIndex = lowerStr.indexOf(lowerSub, lastIndex)) != -1) {
            count++;
            lastIndex += lowerSub.length();
        }
        return count;
    }

    // 10. Thay n ký tự bên phải của chuỗi 1 bởi chuỗi 2
    public static String task10(String str1, String str2) {
        if (str2.length() >= str1.length())
            return str2;
        return str1.substring(0, str1.length() - str2.length()) + str2;
    }
}