package Task54A10;

public class Circle {
    // Thuộc tính (Property)
    private double radius = 1.0;

    // Các phương thức khởi tạo (Constructors)
    public Circle() {
        // Sử dụng giá trị mặc định là 1.0
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính diện tích: S = PI * r^2
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Phương thức tính chu vi: C = 2 * PI * r
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    // Phương thức toString trả về chuỗi mô tả đối tượng
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}