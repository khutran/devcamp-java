import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Kết quả Task 52A.40 (Mảng nâng cao) ---");

        // Task 1: Tạo mảng từ x đến y
        System.out.println("Task 1 (4, 7): " + Arrays.toString(task1(4, 7)));
        System.out.println("Task 1 (-4, 7): " + Arrays.toString(task1(-4, 7)));

        // Task 2: Gộp 2 mảng, bỏ trùng
        int[] arr2_a = { 1, 2, 3 };
        int[] arr2_b = { 100, 2, 1, 10 };
        System.out.println("Task 2: " + Arrays.toString(task2(arr2_a, arr2_b)));

        // Task 3: Đếm số lần xuất hiện n
        int[] arr3 = { 1, 2, 1, 4, 5, 1, 1, 3, 1 };
        System.out.println("Task 3 (n=1): " + task3(arr3, 1));
        System.out.println("Task 3 (n=2): " + task3(arr3, 2));

        // Task 4: Tổng các phần tử
        int[] arr4 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Task 4: " + task4(arr4));

        // Task 5: Lọc số chẵn
        int[] arr5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Task 5: " + Arrays.toString(task5(arr5)));

        // Task 6: Cộng 2 mảng theo vị trí tương ứng
        int[] arr6_a = { 1, 0, 2, 3, 4 };
        int[] arr6_b = { 3, 5, 6, 7, 8, 13 };
        System.out.println("Task 6: " + Arrays.toString(task6(arr6_a, arr6_b)));

        // Task 7: Loại bỏ phần tử trùng trong 1 mảng
        int[] arr7 = { 1, 2, 3, 1, 5, 1, 4, 6, 3, 4 };
        System.out.println("Task 7: " + Arrays.toString(task7(arr7)));

        // Task 8: Lấy phần tử chỉ xuất hiện ở 1 trong 2 mảng
        int[] arr8_a = { 1, 2, 3 };
        int[] arr8_b = { 100, 2, 1, 10 };
        System.out.println("Task 8: " + Arrays.toString(task8(arr8_a, arr8_b)));

        // Task 9: Sắp xếp giảm dần
        int[] arr9 = { 1, 3, 1, 4, 2, 5, 6 };
        System.out.println("Task 9: " + Arrays.toString(task9(arr9)));

        // Task 10: Đổi vị trí x và y
        Object[] arr10 = { 10, 20, 30, 40, "52A" };
        System.out.println("Task 10 (x=0, y=2): " + Arrays.toString(task10(arr10, 0, 2)));
        Object[] arr10_2 = { 10, 20, 30, 40, "52A" };
        System.out.println("Task 10 (x=1, y=2): " + Arrays.toString(task10(arr10_2, 1, 2)));
    }

    // 1. Tạo mảng từ x đến y
    public static int[] task1(int x, int y) {
        int size = Math.abs(y - x) + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = x + i;
        }
        return result;
    }

    // 2. Gộp 2 mảng, bỏ trùng (Union)
    public static int[] task2(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr1)
            set.add(i);
        for (int i : arr2)
            set.add(i);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // 3. Đếm số lần xuất hiện của n
    public static int task3(int[] arr, int n) {
        int count = 0;
        for (int i : arr)
            if (i == n)
                count++;
        return count;
    }

    // 4. Tính tổng mảng
    public static int task4(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    // 5. Tạo mảng gồm toàn số chẵn
    public static int[] task5(int[] arr) {
        return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    }

    // 6. Tổng 2 mảng tại vị trí tương ứng
    public static int[] task6(int[] arr1, int[] arr2) {
        int maxLen = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLen];
        for (int i = 0; i < maxLen; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 + val2;
        }
        return result;
    }

    // 7. Loại bỏ trùng trong 1 mảng
    public static int[] task7(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr)
            set.add(i);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    // 8. Lấy phần tử không trùng nhau giữa 2 mảng (Symmetric Difference)
    public static int[] task8(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i : arr1)
            list1.add(i);
        List<Integer> list2 = new ArrayList<>();
        for (int i : arr2)
            list2.add(i);

        List<Integer> result = new ArrayList<>();
        for (int i : arr1)
            if (!list2.contains(i))
                result.add(i);
        for (int i : arr2)
            if (!list1.contains(i))
                result.add(i);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 9. Sắp xếp giảm dần
    public static int[] task9(int[] arr) {
        int[] result = arr.clone();
        Arrays.sort(result);
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }
        return result;
    }

    // 10. Đổi vị trí x sang y
    public static Object[] task10(Object[] arr, int x, int y) {
        if (x >= 0 && x < arr.length && y >= 0 && y < arr.length) {
            Object temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }
}