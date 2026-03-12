import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Tạo số ngẫu nhiên kiểu double từ 1-100
        // formula: min + (max - min) * random.nextDouble()
        double randomDouble = 1.0 + (100.0 - 1.0) * random.nextDouble();
        System.out.println("Số ngẫu nhiên kiểu double (1-100): " + randomDouble);

        // 2. Tạo số ngẫu nhiên kiểu int từ 1-10
        // formula: random.nextInt(max - min + 1) + min
        int randomInt = random.nextInt(10 - 1 + 1) + 1;
        System.out.println("Số ngẫu nhiên kiểu int (1-10): " + randomInt);
    }
}
