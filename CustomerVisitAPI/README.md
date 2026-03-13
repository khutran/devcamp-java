# CustomerVisitAPI

Dự án Spring Boot REST API quản lý Khách hàng và Chuyến thăm, minh họa quan hệ thực thể và tính toán chi phí dịch vụ/sản phẩm.

## API Endpoints

### 1. Lấy danh sách chuyến thăm
- **URL:** `/visits`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Visit`. Mỗi chuyến thăm liên kết với một đối tượng `Customer`.
- **Logic:** 
    - Khởi tạo 3 khách hàng (Alice - Gold, Bob - Silver, Charlie - Non-member).
    - Khởi tạo 3 chuyến thăm với các chi phí dịch vụ và sản phẩm khác nhau.
    - Tính toán tổng chi phí (`getTotalExpense()`).
    - In thông tin `toString()` của khách hàng và chuyến thăm ra console của server.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập: `http://localhost:8080/visits`
