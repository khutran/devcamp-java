package Task54C70;

// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng
        Circle circle = new Circle(10.0);
        ResizableCircle resizableCircle = new ResizableCircle(10.0);

        System.out.println("--- Thông tin ban đầu ---");
        System.out.println(circle.toString());
        System.out.printf("Circle - Chu vi: %.2f, Diện tích: %.2f\n",
                circle.getPerimeter(), circle.getArea());

        System.out.println(resizableCircle.toString());
        System.out.printf("ResizableCircle - Chu vi: %.2f, Diện tích: %.2f\n",
                resizableCircle.getPerimeter(), resizableCircle.getArea());

        // 2. Thực hiện resize (ví dụ: giảm còn 50% kích thước)
        int percent = 50;
        System.out.println("\n--- Thực hiện resize ResizableCircle xuống " + percent + "% ---");
        resizableCircle.resize(percent);

        // 3. In lại kết quả sau khi resize
        System.out.println(resizableCircle.toString());
        System.out.printf("Sau resize - Chu vi: %.2f, Diện tích: %.2f\n",
                resizableCircle.getPerimeter(), resizableCircle.getArea());
    }
}