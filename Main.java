import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Kết quả Task 52A.20 ---");

        // Task 1
        System.out.println("Task 1 (String): " + task1("Devcamp"));
        System.out.println("Task 1 (Array): " + task1(new int[] { 1, 2, 3 }));

        // Task 2
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Task 2 (n=3): " + task2(arr2, 3));
        System.out.println("Task 2 (n=6): " + task2(arr2, 6));

        // Task 3
        int[] arr3 = { 3, 8, 7, 6, 5, -4, -3, 2, 1 };
        System.out.println("Task 3: " + Arrays.toString(task3(arr3)));

        // Task 4
        int[] arr4 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Task 4 (n=3): " + task4(arr4, 3));
        System.out.println("Task 4 (n=7): " + task4(arr4, 7));

        // Task 5
        int[] arr5_1 = { 1, 2, 3 };
        int[] arr5_2 = { 4, 5, 6 };
        System.out.println("Task 5: " + Arrays.toString(task5(arr5_1, arr5_2)));

        // Task 6
        Object[] arr6 = { true, 0, 15, false, -22, "html", "develop", 47, null };
        System.out.println("Task 6: " + Arrays.toString(task6(arr6)));

        // Task 7
        int[] arr7 = { 2, 5, 9, 6 };
        System.out.println("Task 7 (n=5): " + Arrays.toString(task7(arr7, 5)));
        System.out.println("Task 7 (n=2): " + Arrays.toString(task7(arr7, 2)));
        System.out.println("Task 7 (n=6): " + Arrays.toString(task7(arr7, 6)));

        // Task 8
        int[] arr8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Task 8 (Random): " + task8(arr8));

        // Task 9
        System.out.println("Task 9 (x=6, y=0): " + Arrays.toString(task9(6, 0)));
        System.out.println("Task 9 (x=4, y=11): " + Arrays.toString(task9(4, 11)));

        // Task 10
        System.out.println("Task 10 (x=1, y=4): " + Arrays.toString(task10(1, 4)));
        System.out.println("Task 10 (x=-6, y=4): " + Arrays.toString(task10(-6, 4)));
    }

    // 1. Kiểm tra một biến có phải mảng hay không
    public static boolean task1(Object input) {
        return input != null && input.getClass().isArray();
    }

    // 2. Trả về phần tử thứ n của mảng (lấy theo index n)
    public static Object task2(int[] arr, int n) {
        if (n >= 0 && n < arr.length) {
            return arr[n];
        }
        return null;
    }

    // 3. Sắp xếp mảng tăng dần
    public static int[] task3(int[] arr) {
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        return newArr;
    }

    // 4. Trả về vị trí (index) của giá trị n trong mảng
    public static int task4(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    // 5. Nối 2 mảng
    public static int[] task5(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    // 6. Lọc mảng chỉ giữ lại số và chuỗi (loại bỏ null, boolean)
    public static Object[] task6(Object[] arr) {
        ArrayList<Object> result = new ArrayList<>();
        for (Object obj : arr) {
            if (obj instanceof Number || obj instanceof String) {
                result.add(obj);
            }
        }
        return result.toArray();
    }

    // 7. Bỏ phần tử có giá trị bằng n
    public static int[] task7(int[] arr, int n) {
        int count = 0;
        for (int x : arr)
            if (x == n)
                count++;

        int[] result = new int[arr.length - count];
        int index = 0;
        for (int x : arr) {
            if (x != n)
                result[index++] = x;
        }
        return result;
    }

    // 8. Lấy random một phần tử
    public static int task8(int[] arr) {
        Random rand = new Random();
        return arr[rand.nextInt(arr.length)];
    }

    // 9. Tạo mảng gồm x phần tử có giá trị y
    public static int[] task9(int x, int y) {
        int[] result = new int[x];
        Arrays.fill(result, y);
        return result;
    }

    // 10. Tạo mảng gồm y số liên tiếp bắt đầu từ x
    public static int[] task10(int x, int y) {
        int[] result = new int[y];
        for (int i = 0; i < y; i++) {
            result[i] = x + i;
        }
        return result;
    }
}