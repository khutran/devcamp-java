package Task54A20;

public class Main {
    public static void main(String[] args) {
        // subTask 3: Khởi tạo 2 đối tượng hình chữ nhật
        // rectangle1: không tham số (mặc định 1.0 x 1.0)
        Rectangle rectangle1 = new Rectangle();

        // rectangle2: có tham số length = 2.0f, width = 3.0f
        Rectangle rectangle2 = new Rectangle(2.0f, 3.0f);

        // In 2 đối tượng ra console bằng phương thức toString()
        System.out.println("Thông tin Rectangle 1: " + rectangle1.toString());
        System.out.println("Thông tin Rectangle 2: " + rectangle2.toString());

        System.out.println("------------------------------------");

        // subTask 4: In diện tích và chu vi của 2 đối tượng
        System.out.println("Kết quả tính toán cho Rectangle 1:");
        System.out.println("- Diện tích: " + rectangle1.getArea());
        System.out.println("- Chu vi: " + rectangle1.getPerimeter());

        System.out.println("\nKết quả tính toán cho Rectangle 2:");
        System.out.println("- Diện tích: " + rectangle2.getArea());
        System.out.println("- Chu vi: " + rectangle2.getPerimeter());
    }
}