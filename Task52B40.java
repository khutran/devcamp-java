import java.util.*;

public class Task52B40 {

    public static void main(String[] args) {
        System.out.println("--- Task 1 ---");
        task1();

        System.out.println("\n--- Task 2 ---");
        task2();

        System.out.println("\n--- Task 3 ---");
        System.out.println("Kết quả Task 3: " + task3());

        System.out.println("\n--- Task 4 ---");
        System.out.println("Tổng Task 4: " + task4());

        System.out.println("\n--- Task 5 ---");
        task5();

        System.out.println("\n--- Task 6 ---");
        task6();

        System.out.println("\n--- Task 7 ---");
        task7();

        System.out.println("\n--- Task 8 ---");
        task8();

        System.out.println("\n--- Task 9 ---");
        task9();

        System.out.println("\n--- Task 10 ---");
        task10();
    }

    // 1. Sắp xếp tăng dần
    public static ArrayList<Integer> task1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(45, 12, 89, 5, 23, 67, 34, 90, 11, 56));
        System.out.println("Vừa tạo: " + list);
        Collections.sort(list);
        System.out.println("Sau khi sắp xếp: " + list);
        return list;
    }

    // 2. Lọc phần tử từ 10 đến 100
    public static ArrayList<Integer> task2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 150, 25, 40, 8, 99, 10, 100, 3, 75));
        System.out.println("Vừa tạo: " + list);
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (num >= 10 && num <= 100) {
                filteredList.add(num);
            }
        }
        System.out.println("ArrayList mới (10-100): " + filteredList);
        return filteredList;
    }

    // 3. Kiểm tra chứa "vàng" (Yellow)
    public static String task3() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Đỏ", "Xanh", "Vàng", "Tím", "Hồng"));
        System.out.println("ArrayList màu: " + colors);
        // Kiểm tra chứa "Vàng" (Yellow)
        if (colors.contains("Vàng") || colors.contains("Yellow")) {
            return "OK";
        }
        return "KO";
    }

    // 4. Tính tổng các số
    public static int task4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("ArrayList: " + list);
        int sum = 0;
        for (int num : list)
            sum += num;
        return sum;
    }

    // 5. Xóa toàn bộ giá trị
    public static ArrayList<String> task5() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        System.out.println("Trước khi xóa: " + colors);
        colors.clear();
        System.out.println("Sau khi xóa: " + colors);
        return colors;
    }

    // 6. Hoán đổi ngẫu nhiên (Shuffle)
    public static ArrayList<String> task6() {
        ArrayList<String> colors = new ArrayList<>(
                Arrays.asList("C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"));
        System.out.println("Nguyên bản: " + colors);
        Collections.shuffle(colors);
        System.out.println("Sau khi hoán đổi ngẫu nhiên: " + colors);
        return colors;
    }

    // 7. Đảo ngược vị trí (Reverse)
    public static ArrayList<String> task7() {
        ArrayList<String> colors = new ArrayList<>(
                Arrays.asList("Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"));
        System.out.println("Trước đảo ngược: " + colors);
        Collections.reverse(colors);
        System.out.println("Sau đảo ngược: " + colors);
        return colors;
    }

    // 8. Cắt List từ phần tử thứ 3 đến thứ 7 (Index 2 đến 7)
    public static List<String> task8() {
        ArrayList<String> colors = new ArrayList<>(
                Arrays.asList("P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10"));
        System.out.println("Nguyên bản: " + colors);
        // subList(fromIndex, toIndex): lấy từ index 2 đến index 6 (phần tử thứ 3-7)
        List<String> sub = colors.subList(2, 7);
        System.out.println("List cắt (3->7): " + sub);
        return sub;
    }

    // 9. Hoán đổi vị trí phần tử thứ 3 và thứ 7
    public static ArrayList<String> task9() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"));
        System.out.println("Trước hoán đổi: " + colors);
        // Phần tử thứ 3 là index 2, phần tử thứ 7 là index 6
        Collections.swap(colors, 2, 6);
        System.out.println("Sau hoán đổi (3↔7): " + colors);
        return colors;
    }

    // 10. Copy ArrayList này sang ArrayList kia
    public static ArrayList<Integer> task10() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Copy list2 vào list1 (Thay thế các phần tử của list1 bằng list2)
        Collections.copy(list1, list2);

        System.out.println("Sau khi copy List 2 vào List 1:");
        System.out.println("List 1 mới: " + list1);
        System.out.println("List 2 vẫn là: " + list2);
        return list1;
    }
}