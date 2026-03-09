package Task54C10;

// Shape.java
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Phương thức trừu tượng: các lớp con bắt buộc phải thực hiện (Provide actual
    // implementation)
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }
}