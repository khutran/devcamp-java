package Task54C60;

// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo các đối tượng
        Cat cat1 = new Cat("Mimi");
        Dog dog1 = new Dog("Ki");
        Dog dog2 = new Dog("Lu");
        BigDog bigDog1 = new BigDog("Gâu");
        BigDog bigDog2 = new BigDog("Bự");

        System.out.println("--- Tiếng kêu của Mèo ---");
        cat1.greets();

        System.out.println("\n--- Tiếng kêu của Chó ---");
        dog1.greets(); // Chó kêu bình thường
        dog1.greets(dog2); // Chó chào chó khác

        System.out.println("\n--- Tiếng kêu của Chó To (BigDog) ---");
        bigDog1.greets(); // Chó to kêu bình thường
        bigDog1.greets(dog1); // Chó to chào chó bình thường
        bigDog1.greets(bigDog2); // Chó to chào chó to khác
    }
}