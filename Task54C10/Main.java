package Task54C10;

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("--- KẾT QUẢ THỰC THI ---");

        // subTask 5: Rectangle
        Rectangle rectangle1 = new Rectangle("Red", 4.0, 5.0);
        Rectangle rectangle2 = new Rectangle("Blue", 10.0, 2.5);

        System.out.println("Diện tích Rectangle 1: " + rectangle1.getArea());
        System.out.println(rectangle1.toString());

        System.out.println("Diện tích Rectangle 2: " + rectangle2.getArea());
        System.out.println(rectangle2.toString());

        System.out.println("-----------------------");

        // subTask 6: Triangle
        Triangle triangle1 = new Triangle("Green", 4.0, 3.0);
        Triangle triangle2 = new Triangle("Yellow", 5.0, 8.0);

        System.out.println("Diện tích Triangle 1: " + triangle1.getArea());
        System.out.println(triangle1.toString());

        System.out.println("Diện tích Triangle 2: " + triangle2.getArea());
        System.out.println(triangle2.toString());
    }
}