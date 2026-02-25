public class Main {

    public static void main(String[] args) {
        // --- Yêu cầu 2 ---
        int totalV1 = sumNumbersV1();
        System.out.println("Tổng 100 số tự nhiên đầu tiên: " + totalV1);

        // --- Yêu cầu 3 ---
        int[] number1 = {1, 5, 10};
        int[] number2 = {1, 2, 3, 5, 7, 9};
        
        int sumArray1 = sumNumbersV2(number1);
        int sumArray2 = sumNumbersV2(number2);
        
        System.out.println("Tổng mảng number1: " + sumArray1);
        System.out.println("Tổng mảng number2: " + sumArray2);

        // --- Yêu cầu 4 ---
        printHello(24);
        printHello(99);
    }

    // Phương thức Yêu cầu 2
    public static int sumNumbersV1() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // Phương thức Yêu cầu 3
    public static int sumNumbersV2(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Phương thức Yêu cầu 4
    public static void printHello(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n + ": Đây là số chẵn");
            } else {
                System.out.println(n + ": Đây là số lẻ");
            }
        }
    }
}