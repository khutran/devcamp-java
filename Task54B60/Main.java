package Task54B60;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // --- subTask 6: Khởi tạo Animal ---
        Animal animal1 = new Animal("Generic Animal 1");
        Animal animal2 = new Animal("Generic Animal 2");
        System.out.println("--- subTask 6: Animal ---");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

        // --- subTask 7: Khởi tạo Mammal ---
        Mammal mammal1 = new Mammal("Mammal A");
        Mammal mammal2 = new Mammal("Mammal B");
        System.out.println("\n--- subTask 7: Mammal ---");
        System.out.println(mammal1.toString());
        System.out.println(mammal2.toString());

        // --- subTask 8: Khởi tạo Cat ---
        Cat cat1 = new Cat("Kitty");
        Cat cat2 = new Cat("Miu");
        System.out.println("\n--- subTask 8: Cat ---");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

        // --- subTask 9: Khởi tạo Dog ---
        Dog dog1 = new Dog("Lu");
        Dog dog2 = new Dog("Ki");
        System.out.println("\n--- subTask 9: Dog ---");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        // --- subTask 10: Greets của Cat ---
        System.out.println("\n--- subTask 10: Cat Greets ---");
        System.out.print(cat1.getName() + " says: ");
        cat1.greets();
        System.out.print(cat2.getName() + " says: ");
        cat2.greets();

        // --- subTask 11: Greets của Dog ---
        System.out.println("\n--- subTask 11: Dog Greets ---");
        System.out.print(dog1.getName() + " says: ");
        dog1.greets();
        System.out.print(dog2.getName() + " says: ");
        dog2.greets();

        // --- subTask 12: Greets của Dog với Dog khác ---
        System.out.println("\n--- subTask 12: Dog greets another Dog ---");
        System.out.print(dog1.getName() + " greets " + dog2.getName() + ": ");
        dog1.greets(dog2);
    }
}