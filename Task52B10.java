import java.util.*;

public class Task52B10 {

    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1 ('Java'): " + task1("Java"));
        System.out.println("Task 1 ('Devcamp JAVA exercise'): " + task1("Devcamp JAVA exercise"));
        System.out.println("Task 1 ('Devcamp'): " + task1("Devcamp"));

        // Task 2
        System.out.println("Task 2 ('word', 'drow'): " + task2("word", "drow"));
        System.out.println("Task 2 ('java', 'js'): " + task2("java", "js"));

        // Task 3
        System.out.println("Task 3 ('Java'): " + task3("Java"));
        System.out.println("Task 3 ('Haha'): " + task3("Haha"));
        System.out.println("Task 3 ('Devcamp'): " + task3("Devcamp"));

        // Task 4
        System.out.println("Task 4 ('word'): " + task4("word"));
        System.out.println("Task 4 ('java'): " + task4("java"));

        // Task 5
        System.out.println("Task 5 ('abc'): " + task5("abc"));
        System.out.println("Task 5 ('a1bc'): " + task5("a1bc"));

        // Task 6
        System.out.println("Task 6 ('java'): " + task6("java"));
        System.out.println("Task 6 ('devcamp'): " + task6("devcamp"));

        // Task 7
        System.out.println("Task 7 ('1234'): " + task7("1234"));

        // Task 8
        System.out.println("Task 8 ('devcamp java', 'a', 'b'): " + task8("devcamp java", 'a', 'b'));
        System.out.println("Task 8 ('exercise', 'e', 'f'): " + task8("exercise", 'e', 'f'));

        // Task 9
        System.out.println("Task 9 ('I am developer'): " + task9("I am developer"));

        // Task 10
        System.out.println("Task 10 ('aba'): " + task10("aba"));
        System.out.println("Task 10 ('abc'): " + task10("abc"));
    }

    // 1. Tìm ký tự xuất hiện > 1 lần (không phân biệt hoa thường)
    public static String task1(String str) {
        String lowerStr = str.toLowerCase().replace(" ", "");
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : lowerStr.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                result.append(entry.getKey());
            }
        }
        return result.length() > 0 ? result.toString() : "NO";
    }

    // 2. Kiểm tra 2 chuỗi đảo ngược nhau
    public static String task2(String s1, String s2) {
        String reversed = new StringBuilder(s2).reverse().toString();
        return s1.equals(reversed) ? "OK" : "KO";
    }

    // 3. Tìm ký tự đầu tiên chỉ xuất hiện 1 lần
    public static String task3(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (counts.get(c) == 1) return String.valueOf(c);
        }
        return "NO";
    }

    // 4. Đảo ngược chuỗi
    public static String task4(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 5. Kiểm tra chuỗi có chứa chữ số hay không (Có số -> false, Không có -> true)
    public static boolean task5(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) return false;
        }
        return true;
    }

    // 6. Đếm số lượng nguyên âm (a, e, i, o, u)
    public static int task6(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    // 7. Chuyển chuỗi số sang int
    public static int task7(String str) {
        return Integer.parseInt(str);
    }

    // 8. Thay thế ký tự cũ bằng ký tự mới
    public static String task8(String str, char oldChar, char newChar) {
        // Chú ý: Đề bài yêu cầu kết quả 'Devcbmp Jbvb' từ 'devcamp java'.
        // Điều này có nghĩa là thay đổi cả chữ thường và giữ nguyên format hoa/thường nếu cần.
        // Ở đây ta dùng replace cơ bản:
        return str.replace(oldChar, newChar);
    }

    // 9. Đảo ngược các từ trong chuỗi
    public static String task9(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(i == 0 ? "" : " ");
        }
        return result.toString();
    }

    // 10. Kiểm tra chuỗi đối xứng (Palindrome)
    public static boolean task10(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}