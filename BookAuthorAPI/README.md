# BookAuthorAPI

Dự án Spring Boot REST API quản lý Tác giả và Sách, minh họa quan hệ thực thể cơ bản.

## API Endpoints

### 1. Lấy danh sách sách
- **URL:** `/books`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Book`, mỗi quyển sách đi kèm với một đối tượng `Author`.
- **Logic:** 
    - Khởi tạo 3 tác giả và 3 quyển sách.
    - In thông tin `toString()` của tác giả và sách ra console của server.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập: `http://localhost:8080/books`
