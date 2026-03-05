package Task54B80;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // subTask 6: Khởi tạo Shape
        Shape s1 = new Shape();
        Shape s2 = new Shape("green", false);
        System.out.println("--- Test 6: Shape ---");
        System.out.println(s1);
        System.out.println(s2);

        // subTask 7: Khởi tạo Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0, "green", true);
        System.out.println("\n--- Test 7: Circle ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // subTask 8: Khởi tạo Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.5, 1.5);
        Rectangle r3 = new Rectangle(2.0, 1.5, "green", true);
        System.out.println("\n--- Test 8: Rectangle ---");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // subTask 9: Khởi tạo Square
        Square sq1 = new Square();
        Square sq2 = new Square(1.5);
        Square sq3 = new Square(2.0, "green", true);
        System.out.println("\n--- Test 9: Square ---");
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);

        // subTask 10: Area & Perimeter of Circles
        System.out.println("\n--- Test 10: Circle Area & Perimeter ---");
        System.out.printf("C1 Area: %.2f, Perimeter: %.2f\n", c1.getArea(), c1.getPerimeter());
        System.out.printf("C2 Area: %.2f, Perimeter: %.2f\n", c2.getArea(), c2.getPerimeter());
        System.out.printf("C3 Area: %.2f, Perimeter: %.2f\n", c3.getArea(), c3.getPerimeter());

        // subTask 11: Area & Perimeter of Rectangles
        System.out.println("\n--- Test 11: Rectangle Area & Perimeter ---");
        System.out.printf("R1 Area: %.2f, Perimeter: %.2f\n", r1.getArea(), r1.getPerimeter());
        System.out.printf("R2 Area: %.2f, Perimeter: %.2f\n", r2.getArea(), r2.getPerimeter());
        System.out.printf("R3 Area: %.2f, Perimeter: %.2f\n", r3.getArea(), r3.getPerimeter());

        // subTask 12: Area & Perimeter of Squares (từ test 9)
        System.out.println("\n--- Test 12: Square Area & Perimeter ---");
        System.out.printf("SQ1 Area: %.2f, Perimeter: %.2f\n", sq1.getArea(), sq1.getPerimeter());
        System.out.printf("SQ2 Area: %.2f, Perimeter: %.2f\n", sq2.getArea(), sq2.getPerimeter());
        System.out.printf("SQ3 Area: %.2f, Perimeter: %.2f\n", sq3.getArea(), sq3.getPerimeter());
    }
}
