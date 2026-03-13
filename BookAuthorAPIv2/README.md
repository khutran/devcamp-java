# BookAuthorAPIv2

Dự án Spring Boot REST API quản lý Tác giả và Sách (Phiên bản 2.0), cho phép một quyển sách có nhiều tác giả.

## API Endpoints

### 1. Lấy danh sách sách
- **URL:** `/books`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Book`. Mỗi quyển sách chứa một danh sách các tác giả (`ArrayList<Author>`).
- **Logic:** 
    - Khởi tạo 6 tác giả.
    - Chia 6 tác giả vào 3 danh sách (mỗi danh sách 2 tác giả).
    - Khởi tạo 3 quyển sách, mỗi quyển gán một danh sách tác giả tương ứng.
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
