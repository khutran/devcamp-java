package Task54C20;

// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo 2 đối tượng point1 và point2
        MovablePoint point1 = new MovablePoint(10, 20);
        MovablePoint point2 = new MovablePoint(0, 0);

        System.out.println("--- Trạng thái ban đầu ---");
        System.out.println("Point 1: " + point1.toString());
        System.out.println("Point 2: " + point2.toString());

        // 2. Sử dụng các phương thức di chuyển cho point1
        System.out.println("\n--- Point 1 thực hiện di chuyển (Up, Right) ---");
        point1.moveUp();
        point1.moveRight();
        System.out.println("Kết quả Point 1: " + point1.toString());

        // 3. Sử dụng các phương thức di chuyển cho point2
        System.out.println("\n--- Point 2 thực hiện di chuyển (Down, Left) ---");
        point2.moveDown();
        point2.moveLeft();
        System.out.println("Kết quả Point 2: " + point2.toString());

        // Thử nghiệm thêm các phương thức khác
        System.out.println("\n--- Di chuyển thêm ---");
        point1.moveDown();
        point2.moveRight();
        System.out.println("Point 1 sau moveDown: " + point1);
        System.out.println("Point 2 sau moveRight: " + point2);
    }
}