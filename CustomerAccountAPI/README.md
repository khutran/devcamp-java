# CustomerAccountAPI

Dự án Spring Boot REST API quản lý Khách hàng và Tài khoản, minh họa quan hệ thực thể, tiền gửi (deposit) và rút tiền (withdraw).

## API Endpoints

### 1. Lấy danh sách tài khoản
- **URL:** `/accounts`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Account`. Mỗi tài khoản liên kết với một đối tượng `Customer`.
- **Logic:** 
    - Khởi tạo 3 khách hàng và 3 tài khoản tương ứng.
    - Hỗ trợ các phương thức `deposit(amount)` và `withdraw(amount)`.
    - In thông tin `toString()` của khách hàng và tài khoản ra console của server.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập: `http://localhost:8080/accounts`
