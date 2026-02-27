import java.util.*;

public class Task52B20 {

    public static void main(String[] args) {
        System.out.println("Task 1: " + task1());
        System.out.println("Task 2: " + task2());
        System.out.println("Task 3 (Size): " + task3());
        System.out.println("Task 4 (4th element): " + task4());
        System.out.println("Task 5 (Last element): " + task5());
        System.out.println("Task 6 (Remove last): " + task6());

        System.out.print("Task 7 (ForEach): ");
        task7();

        System.out.print("Task 8 (Iterator): ");
        task8();

        System.out.print("Task 9 (For loop): ");
        task9();

        System.out.println("\nTask 10 (Add to head): " + task10());
        System.out.println("Task 11 (Update 3rd): " + task11());
        System.out.println("Task 12 (Index of Alice & Mark): " + task12());
        System.out.println("Task 13 (Last index of Steve & John): " + task13());
    }

    // 1. Tạo mới ArrayList String, thêm 5 màu sắc
    public static ArrayList<String> task1() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        return colors;
    }

    // 2. Cộng giá trị của ArrayList này vào ArrayList kia
    public static ArrayList<Integer> task2() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        list1.addAll(list2);
        return list1;
    }

    // 3. Trả về số lượng phần tử
    public static int task3() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        return colors.size();
    }

    // 4. Trả về phần tử thứ 4 (index 3)
    public static String task4() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        return colors.get(3);
    }

    // 5. Trả về phần tử cuối cùng (Không dùng index trực tiếp ví dụ .get(4))
    public static String task5() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        return colors.get(colors.size() - 1);
    }

    // 6. Xóa phần tử cuối cùng
    public static ArrayList<String> task6() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        colors.remove(colors.size() - 1);
        return colors;
    }

    // 7. Sử dụng forEach để in (Hàm return về list để đúng cấu trúc yêu cầu)
    public static ArrayList<String> task7() {
        ArrayList<String> colors = task1();
        colors.forEach(color -> System.out.print(color + " "));
        System.out.println();
        return colors;
    }

    // 8. Sử dụng Iterator
    public static ArrayList<String> task8() {
        ArrayList<String> colors = task1();
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        return colors;
    }

    // 9. Sử dụng vòng lặp for
    public static ArrayList<String> task9() {
        ArrayList<String> colors = task1();
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        return colors;
    }

    // 10. Thêm màu vào đầu ArrayList (index 0)
    public static ArrayList<String> task10() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
        colors.add(0, "Purple");
        return colors;
    }

    // 11. Sửa phần tử thứ 3 (index 2) thành màu vàng
    public static ArrayList<String> task11() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Black", "White", "Pink"));
        colors.set(2, "Yellow");
        return colors;
    }

    // 12. Vị trí đầu tiên của Alice và Mark
    public static List<Integer> task12() {
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("John", "Alice", "Bob", "Steve", "John", "Steve", "Maria"));
        int indexAlice = names.indexOf("Alice");
        int indexMark = names.indexOf("Mark");
        return Arrays.asList(indexAlice, indexMark);
    }

    // 13. Vị trí cuối cùng của Steve và John
    public static List<Integer> task13() {
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("John", "Alice", "Bob", "Steve", "John", "Steve", "Maria"));
        int lastSteve = names.lastIndexOf("Steve");
        int lastJohn = names.lastIndexOf("John");
        return Arrays.asList(lastSteve, lastJohn);
    }
}