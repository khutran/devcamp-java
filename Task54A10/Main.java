package Task54A10;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo 2 đối tượng hình tròn
        // circle1 sử dụng constructor không tham số (radius mặc định = 1.0)
        Circle circle1 = new Circle();

        // circle2 sử dụng constructor có tham số (radius = 3.0)
        Circle circle2 = new Circle(3.0);

        // 2. Sử dụng toString để in thông tin đối tượng ra console
        System.out.println("Thông tin Circle 1: " + circle1.toString());
        System.out.println("Thông tin Circle 2: " + circle2.toString());

        System.out.println("------------------------------------");

        // 3. In ra diện tích và chu vi của 2 đối tượng
        System.out.println("Circle 1:");
        System.out.println("- Diện tích: " + circle1.getArea());
        System.out.println("- Chu vi: " + circle1.getCircumference());

        System.out.println("\nCircle 2:");
        System.out.println("- Diện tích: " + circle2.getArea());
        System.out.println("- Chu vi: " + circle2.getCircumference());
    }
}