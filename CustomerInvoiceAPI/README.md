# CustomerInvoiceAPI

Dự án Spring Boot REST API quản lý Khách hàng và Hóa đơn, minh họa quan hệ thực thể và tính toán chiết khấu.

## API Endpoints

### 1. Lấy danh sách hóa đơn
- **URL:** `/invoices`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Invoice`. Mỗi hóa đơn đi kèm với một đối tượng `Customer`.
- **Logic:** 
    - Khởi tạo 3 khách hàng và 3 hóa đơn tương ứng.
    - Tính toán số tiền sau chiết khấu (`getAmountAfterDiscount()`).
    - In thông tin `toString()` của khách hàng và hóa đơn ra console của server.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập: `http://localhost:8080/invoices`
