public class Task52A50 {

    public static void main(String[] args) {
        System.out.println("--- Kết quả Task 52A.50 (String nâng cao) ---");

        // Task 1: Đếm số lần xuất hiện ký tự n (không phân biệt hoa thường để ra kết
        // quả 5)
        System.out.println("Task 1: " + task1("DCresource: JavaScript Exercises", 'e'));

        // Task 2: Loại bỏ khoảng trắng đầu cuối
        System.out.println("Task 2 ('dcresource '): '" + task2("dcresource ") + "'");
        System.out.println("Task 2 (' dcresource'): '" + task2(" dcresource") + "'");
        System.out.println("Task 2 (' dcresource '): '" + task2(" dcresource ") + "'");

        // Task 3: Loại bỏ chuỗi con
        System.out.println("Task 3: " + task3("The quick brown fox jumps over the lazy dog", "the"));

        // Task 4: Kiểm tra kết thúc chuỗi
        System.out.println("Task 4 ('PYTHON'): " + task4("JS PHP PYTHON", "PYTHON"));
        System.out.println("Task 4 ('JS'): " + task4("JS PHP PYTHON", "JS"));

        // Task 5: So sánh 2 chuỗi (không phân biệt hoa thường theo ví dụ)
        System.out.println("Task 5 (abcd, AbcD): " + task5("abcd", "AbcD"));
        System.out.println("Task 5 (ABCD, Abce): " + task5("ABCD", "Abce"));

        // Task 6: Kiểm tra ký tự thứ n có viết hoa không
        System.out.println("Task 6 (n=1): " + task6("JsSTRING EXERCISES", 1));
        System.out.println("Task 6 (n=2): " + task6("JsSTRING EXERCISES", 2));

        // Task 7: Kiểm tra ký tự thứ n có viết thường không
        System.out.println("Task 7 (n=1): " + task7("JsSTRING EXERCISES", 1));
        System.out.println("Task 7 (n=2): " + task7("JsSTRING EXERCISES", 2));

        // Task 8: Kiểm tra bắt đầu bằng chuỗi sau
        System.out.println("Task 8: " + task8("jsstring exercises", "js"));

        // Task 9: Kiểm tra chuỗi rỗng
        System.out.println("Task 9 ('abc'): " + task9("abc"));
        System.out.println("Task 9 (''): " + task9(""));

        // Task 10: Đảo ngược chuỗi
        System.out.println("Task 10: " + task10("AaBbc"));
    }

    // 1. Đếm số lần xuất hiện của ký tự n (Case-insensitive để khớp output = 5)
    public static int task1(String str, char n) {
        int count = 0;
        char lowerN = Character.toLowerCase(n);
        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == lowerN) {
                count++;
            }
        }
        return count;
    }

    // 2. Loại bỏ khoảng trắng đầu và cuối
    public static String task2(String str) {
        return str.trim();
    }

    // 3. Loại bỏ chuỗi con (Xử lý khoảng trắng thừa sau khi xóa)
    public static String task3(String str, String sub) {
        // Thay thế "the " bằng rỗng để kết quả đẹp như output
        String result = str.replace(sub + " ", "");
        // Nếu không có khoảng trắng phía sau thì xóa chính nó
        result = result.replace(sub, "");
        return result.trim();
    }

    // 4. Kiểm tra chuỗi kết thúc bằng...
    public static boolean task4(String str, String sub) {
        return str.endsWith(sub);
    }

    // 5. So sánh 2 chuỗi giống nhau (IgnoreCase dựa theo input/output mẫu)
    public static boolean task5(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // 6. Kiểm tra ký tự thứ n có phải viết hoa (Sử dụng index n)
    public static boolean task6(String str, int n) {
        if (n < 0 || n >= str.length())
            return false;
        return Character.isUpperCase(str.charAt(n));
    }

    // 7. Kiểm tra ký tự thứ n có phải viết thường (Sử dụng index n)
    public static boolean task7(String str, int n) {
        if (n < 0 || n >= str.length())
            return false;
        return Character.isLowerCase(str.charAt(n));
    }

    // 8. Kiểm tra chuỗi bắt đầu bằng...
    public static boolean task8(String str, String sub) {
        return str.startsWith(sub);
    }

    // 9. Kiểm tra chuỗi rỗng
    public static boolean task9(String str) {
        return str == null || str.isEmpty();
    }

    // 10. Đảo ngược chuỗi
    public static String task10(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}