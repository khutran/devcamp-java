# RectangleRestAPI

Dự án Spring Boot cung cấp các API để tính diện tích và chu vi của hình chữ nhật.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoints

### 1. Tính diện tích hình chữ nhật
- **URL:** `http://localhost:8080/rectangle-area`
- **Method:** `GET`
- **Tham số:**
    - `length` (float): Chiều dài
    - `width` (float): Chiều rộng
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8080/rectangle-area?length=10&width=5"
  ```
- **Kết quả trả về:** `50.0`

### 2. Tính chu vi hình chữ nhật
- **URL:** `http://localhost:8080/rectangle-perimeter`
- **Method:** `GET`
- **Tham số:**
    - `length` (float): Chiều dài
    - `width` (float): Chiều rộng
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8080/rectangle-perimeter?length=10&width=5"
  ```
- **Kết quả trả về:** `30.0`

## Kiểm thử (Testing)

Dự án bao gồm các unit test để kiểm tra logic tính toán. Bạn có thể chạy test bằng lệnh:
```bash
mvn test
```
