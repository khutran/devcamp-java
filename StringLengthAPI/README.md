# StringLengthAPI

Dự án Spring Boot trả về chiều dài của chuỗi đầu vào.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8087/length`
- **Method:** `GET`
- **Tham số:** `input` (Chuỗi cần lấy chiều dài)
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8087/length?input=Hello%20Devcamp"
  ```
