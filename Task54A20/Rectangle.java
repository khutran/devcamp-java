package Task54A20;

public class Rectangle {
    // Thuộc tính (Properties) với giá trị mặc định là 1.0f
    private float length = 1.0f;
    private float width = 1.0f;

    // 1. Phương thức khởi tạo không tham số
    public Rectangle() {
    }

    // 2. Phương thức khởi tạo có tham số
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // --- Getter và Setter ---
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // --- Các phương thức tính toán ---

    // Tính diện tích: dài * rộng
    public double getArea() {
        return (double) length * width;
    }

    // Tính chu vi: (dài + rộng) * 2
    public double getPerimeter() {
        return 2.0 * (length + width);
    }

    // Phương thức toString trả về chuỗi mô tả đối tượng
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}