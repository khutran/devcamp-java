package Task54C50;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng MovablePoint
        MovablePoint point = new MovablePoint(10, 10, 2, 3);

        // Khởi tạo 1 đối tượng MovableCircle
        MovableCircle circle = new MovableCircle(50, 50, 5, 5, 20);

        System.out.println("--- Trạng thái ban đầu ---");
        System.out.println("Point: " + point.toString());
        System.out.println("Circle: " + circle.toString());

        // Thực hiện di chuyển
        point.moveUp(); // y sẽ thành 10 - 3 = 7
        point.moveRight(); // x sẽ thành 10 + 2 = 12

        circle.moveDown(); // y tâm sẽ thành 50 + 5 = 55
        circle.moveLeft(); // x tâm sẽ thành 50 - 5 = 45

        System.out.println("\n--- Sau khi di chuyển ---");
        System.out.println("Point (Up, Right): " + point.toString());
        System.out.println("Circle (Down, Left): " + circle.toString());
    }
}
