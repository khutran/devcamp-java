package Task54C30;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Circle circle = new Circle(5.5, "blue", false);
        Rectangle rectangle = new Rectangle(4.0, 8.0, "green", true);
        Square square = new Square(6.0, "yellow", true);

        // In kết quả cho Circle
        System.out.println("--- CIRCLE ---");
        System.out.println(circle.toString());
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", circle.getArea(), circle.getPerimeter());

        // In kết quả cho Rectangle
        System.out.println("\n--- RECTANGLE ---");
        System.out.println(rectangle.toString());
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", rectangle.getArea(), rectangle.getPerimeter());

        // In kết quả cho Square
        System.out.println("\n--- SQUARE ---");
        System.out.println(square.toString());
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", square.getArea(), square.getPerimeter());
    }
}
