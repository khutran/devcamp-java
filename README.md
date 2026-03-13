# Devcamp Java Projects

Tổng hợp các bài tập và dự án Spring Boot tại Devcamp.

## Các dự án REST API

Dưới đây là danh sách các dự án Spring Boot REST API trong repository này:

### 1. [RectangleRestAPI](./RectangleRestAPI)
Dự án cung cấp các API để tính diện tích và chu vi của hình chữ nhật.
- **Endpoints:** `/rectangle-area`, `/rectangle-perimeter`

### 2. [OddEvenNumberAPI](./OddEvenNumberAPI)
Dự án kiểm tra một số là chẵn hay lẻ.
- **Endpoints:** `/checknumber`

### 3. [StringLengthAPI](./StringLengthAPI)
Dự án tính chiều dài của một chuỗi đầu vào.
- **Endpoints:** `/length`

### 4. [CircleRestAPI](./CircleRestAPI)
Dự án tính diện tích hình tròn.
- **Endpoints:** `/circle-area`

### 5. [RainbowRestAPI](./RainbowRestAPI)
Dự án trả về danh sách màu sắc của cầu vồng.
- **Endpoints:** `/rainbow`

### 6. [SplitStringAPI](./SplitStringAPI)
Dự án tách chuỗi thành danh sách các từ.
- **Endpoints:** `/split`

### 7. [EmployeeRestAPI](./EmployeeRestAPI)
Dự án quản lý thông tin nhân viên.
- **Endpoints:** `/employees`

### 8. [InvoiceRestAPI](./InvoiceRestAPI)
Dự án quản lý các mục trong hóa đơn.
- **Endpoints:** `/invoices`

### 9. [AccountRestAPI](./AccountRestAPI)
Dự án quản lý tài khoản người dùng.
- **Endpoints:** `/accounts`

### 11. [RandomNumberApp](./RandomNumberApp)
Dự án Java Console sinh số ngẫu nhiên.

### 12. [CountryRegionApp](./CountryRegionApp)
Dự án Java Console quản lý Quốc gia và Vùng miền.

### 13. [CircleCylinderAPI](./CircleCylinderAPI)
Dự án Spring Boot REST API tính diện tích hình tròn và thể tích hình trụ.

### 14. [BookAuthorAPI](./BookAuthorAPI)
Dự án Spring Boot REST API quản lý Tác giả và Sách.

### 15. [BookAuthorAPIv2](./BookAuthorAPIv2)
Dự án Spring Boot REST API quản lý Tác giả và Sách (Phiên bản 2.0 - Nhiều tác giả).

### 16. [CustomerInvoiceAPI](./CustomerInvoiceAPI)
Dự án Spring Boot REST API quản lý Khách hàng và Hóa đơn.

### 17. [CustomerAccountAPI](./CustomerAccountAPI)
Dự án Spring Boot REST API quản lý Khách hàng và Tài khoản.

### 18. [CustomerVisitAPI](./CustomerVisitAPI)
Dự án Spring Boot REST API quản lý Khách hàng và Chuyến thăm.

### 19. [AnimalAPI](./AnimalAPI)
Dự án Spring Boot REST API minh họa cấu trúc kế thừa Animal -> Mammal -> Cat/Dog.

### 20. [ShapeAPI](./ShapeAPI)
Dự án Spring Boot REST API tính toán diện tích và chu vi (Circle, Rectangle, Square).

### 21. [CountryRegionAPI](./CountryRegionAPI)
Dự án Spring Boot REST API quản lý Quốc gia và Vùng miền sử dụng Service và đóng gói WAR.

## Cách chạy các dự án

Mỗi dự án là một project Spring Boot độc lập. Để chạy một dự án:

1. Di chuyển vào thư mục của dự án đó.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```
   (Hoặc sử dụng extension Spring Boot Dashboard trong VS Code)

## Yêu cầu hệ thống
- Java 17+
- Maven 3.6+
