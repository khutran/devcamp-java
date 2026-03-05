package Task54B20;

// File: Cylinder.java
public class Cylinder extends Circle {
    // Thuộc tính riêng của Cylinder
    private double height = 1.0;

    // Constructor mặc định: gọi constructor lớp cha
    public Cylinder() {
        super();
    }

    // Constructor có tham số radius
    public Cylinder(double radius) {
        super(radius);
    }

    // Constructor có tham số radius và height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor đầy đủ tham số: radius, height và color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter và Setter cho height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ: Diện tích đáy * Chiều cao
    public double getVolume() {
        return getArea() * height;
    }

    // Có thể ghi đè toString để hiển thị đầy đủ thông tin (tùy chọn)
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}