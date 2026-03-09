package Task54C40;

// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng hình tròn và hình chữ nhật
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // 2. Sử dụng phương thức toString() để in thông tin đối tượng
        System.out.println("--- Thông tin đối tượng ---");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

        // 3. In chu vi và diện tích
        System.out.println("\n--- Kết quả tính toán ---");

        System.out.println("Circle:");
        System.out.printf("- Diện tích: %.2f\n", circle.getArea());
        System.out.printf("- Chu vi: %.2f\n", circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.printf("- Diện tích: %.2f\n", rectangle.getArea());
        System.out.printf("- Chu vi: %.2f\n", rectangle.getPerimeter());
    }
}