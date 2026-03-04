package Task54A40;

public class Main {
    public static void main(String[] args) {
        // subTask 3: Khởi tạo 2 đối tượng hóa đơn với tham số tự quy định
        InvoiceItem invoiceItem1 = new InvoiceItem("HD001", "Laptop Gaming", 2, 25000000.0);
        InvoiceItem invoiceItem2 = new InvoiceItem("HD002", "Chuột không dây", 5, 450000.0);

        // Sử dụng toString để in thông tin 2 đối tượng ra console
        System.out.println("Hóa đơn 1: " + invoiceItem1.toString());
        System.out.println("Hóa đơn 2: " + invoiceItem2.toString());

        System.out.println("--------------------------------------------------");

        // subTask 4: In ra tổng giá của 2 hóa đơn
        System.out
                .println("Tổng giá hóa đơn 1 (ID: " + invoiceItem1.getID() + "): " + invoiceItem1.getTotal() + " VND");
        System.out
                .println("Tổng giá hóa đơn 2 (ID: " + invoiceItem2.getID() + "): " + invoiceItem2.getTotal() + " VND");
    }
}