package Task54B20;

// File: Circle.java
public class Circle {
    // Các thuộc tính private có giá trị mặc định
    private double radius = 1.0;
    private String color = "red";

    // Constructor mặc định (không tham số)
    public Circle() {
    }

    // Constructor có tham số radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor có tham số radius và color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính diện tích hình tròn: PI * r * r
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Ghi đè phương thức toString theo định dạng yêu cầu
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}