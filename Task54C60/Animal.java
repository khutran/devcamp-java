package Task54C60;

// Animal.java
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng (bắt buộc các lớp con phải triển khai)
    public abstract void greets();
}
