import java.util.*;

public class Task52B30 {

    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1 ('bananas'): " + task1("bananas"));
        System.out.println("Task 1 ('devcamp'): " + task1("devcamp"));

        // Task 2
        System.out.println("Task 2 ('Devcamp java'): " + task2("Devcamp java"));
        System.out.println("Task 2 ('Abc  abc bac'): " + task2("Abc  abc bac"));

        // Task 3
        System.out.println("Task 3 ('abc', 'def'): " + task3("abc", "def"));

        // Task 4
        System.out.println("Task 4 ('Devcamp java', 'java'): " + task4("Devcamp java", "java"));

        // Task 5 (Lấy ký tự thứ k - tính theo 1-based index)
        System.out.println("Task 5 ('Devcamp java', 3): " + task5("Devcamp java", 3));

        // Task 6
        System.out.println("Task 6 ('Devcamp java', 'a'): " + task6("Devcamp java", 'a'));

        // Task 7
        System.out.println("Task 7 ('Devcamp java', 'a'): " + task7("Devcamp java", 'a'));

        // Task 8
        System.out.println("Task 8 ('Devcamp'): " + task8("Devcamp"));

        // Task 9 & 15 (Đảo ngược hoa thường)
        System.out.println("Task 9/15 ('DevCamp'): " + task9("DevCamp"));

        // Task 10
        System.out.println("Task 10 ('DevCamp'): " + task10("DevCamp"));

        // Task 11
        System.out.println("Task 11 ('DevCamp123'): " + task11("DevCamp123"));

        // Task 12
        System.out.println("Task 12 ('abcdefghijklmnopqrstuvwxy', 5): " + task12("abcdefghijklmnopqrstuvwxy", 5));

        // Task 13
        System.out.println("Task 13 ('aabaarmq'): " + task13("aabaarmq"));

        // Task 14
        System.out.println("Task 14 ('Welcome', 'home'): " + task14("Welcome", "home"));

        // Task 16
        System.out.println("Task 16 ('DevCamp'): " + task16("DevCamp"));
        System.out.println("Task 16 ('DevCamp123'): " + task16("DevCamp123"));

        // Task 17
        System.out.println("Task 17 ('DevCamp123'): " + task17("DevCamp123"));
        System.out.println("Task 17 ('DEVCAMP 123'): " + task17("DEVCAMP 123"));
    }

    // 1. Xóa ký tự lặp lại, giữ lại ký tự đầu tiên
    public static String task1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // 2. Đếm số lượng từ
    public static int task2(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    // 3. Nối chuỗi s2 vào s1
    public static String task3(String s1, String s2) {
        return s1.concat(s2);
    }

    // 4. Kiểm tra s1 chứa s2
    public static boolean task4(String s1, String s2) {
        return s1.contains(s2);
    }

    // 5. Ký tự thứ k (Ví dụ k=3 trong 'Dev' là 'v' -> index k-1)
    public static char task5(String str, int k) {
        return str.charAt(k - 1);
    }

    // 6. Đếm số lần xuất hiện của ký tự
    public static int task6(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }

    // 7. Vị trí đầu tiên của ký tự
    public static int task7(String str, char c) {
        return str.indexOf(c);
    }

    // 8. In thường sang in hoa
    public static String task8(String str) {
        return str.toUpperCase();
    }

    // 9 & 15. Đổi hoa thành thường và ngược lại
    public static String task9(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else sb.append(c);
        }
        return sb.toString();
    }

    // 10. Đếm ký tự in hoa
    public static int task10(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count;
    }

    // 11. Chỉ hiển thị các ký tự A-Z (In hoa)
    public static String task11(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') sb.append(c);
        }
        return sb.toString();
    }

    // 12. Chia chuỗi thành các phần bằng nhau n ký tự
    public static String task12(String str, int n) {
        if (n <= 0 || str.length() % n != 0) return "KO";
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < str.length(); i += n) {
            parts.add(str.substring(i, i + n));
        }
        return String.join(", ", parts);
    }

    // 13. Xóa các ký tự liền kề và giống nhau (Ví dụ 'aa' -> xóa sạch)
    public static String task13(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                char repeatChar = str.charAt(i);
                while (i < str.length() && str.charAt(i) == repeatChar) {
                    i++; // Bỏ qua tất cả các ký tự giống nhau liên tiếp
                }
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }

    // 14. Gắn 2 chuỗi, cắt chuỗi dài hơn từ phía đầu cho bằng nhau
    public static String task14(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) s1 = s1.substring(len1 - len2);
        else if (len2 > len1) s2 = s2.substring(len2 - len1);
        return s1 + s2;
    }

    // 16. Kiểm tra chuỗi có chứa số hay không
    public static boolean task16(String str) {
        return str.matches(".*\\d.*");
    }

    // 17. Kiểm tra theo Regex: dài <=20, ko cách, bắt đầu Hoa, kết thúc Số
    public static boolean task17(String str) {
        // Giải thích Regex:
        // ^[A-Z] : Bắt đầu bằng chữ hoa
        // \S*    : Các ký tự không phải khoảng trắng
        // [0-9]$ : Kết thúc bằng số
        if (str.length() > 20) return false;
        String pattern = "^[A-Z]\\S*[0-9]$";
        return str.matches(pattern);
    }
}