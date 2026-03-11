# StringLengthAPI

Dự án Spring Boot trả về chiều dài của chuỗi đầu vào.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8080/length`
- **Method:** `GET`
- **Tham số:** `input` (Chuỗi cần lấy chiều dài)
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8080/length?input=Hello%20Devcamp"
  ```

## Kiểm thử (Testing)

Dự án bao gồm các unit test để kiểm tra logic của API. Bạn có thể chạy test bằng lệnh:
```bash
mvn test
```
